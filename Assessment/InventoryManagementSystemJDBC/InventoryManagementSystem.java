import java.util.Scanner;
import java.sql.*;

public class InventoryManagementSystem {

    private static final String host = "jdbc:mysql://localhost:3306/";
    private static final String db_name = "inventory_management_system";

    private static final String db_url = host + db_name;
    private static final String db_user_name = "root";
    private static final String db_password = "";

    private static Connection conn;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            conn = DriverManager.getConnection(db_url, db_user_name, db_password);
            createTableIfNotExists();
            displayMainMenu();

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            sc.close();

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void createTableIfNotExists() throws SQLException {

        try (Statement stmt = conn.createStatement()) {

            String createTableQuery = "CREATE TABLE IF NOT EXISTS products (" +
                    "product_id INT PRIMARY KEY," +
                    "product_name VARCHAR(100)," +
                    "product_price DOUBLE," +
                    "product_quantity INT," +
                    "product_company VARCHAR(100))";
                    
            stmt.executeUpdate(createTableQuery);
        }
    }

    private static void displayMainMenu() throws SQLException {

        while (true) {
        
            System.out.println("------ Inventory Management System ------");
            System.out.println("1. Add Stock");
            System.out.println("2. View Stock");
            System.out.println("3. Search Stock");
            System.out.println("4. Edit Stock");
            System.out.println("5. Delete Stock");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addStock();
                    break;
                case 2:
                    viewStock();
                    break;
                case 3:
                    searchStock();
                    break;
                case 4:
                    editStock();
                    break;
                case 5:
                    deleteStock();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addStock() throws SQLException {

        System.out.println("------ Add Stock ------");
        
        System.out.print("Product ID: ");
        int productId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Product Price: ");
        double productPrice = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Product Quantity: ");
        int productQuantity = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Product Company: ");
        String productCompany = sc.nextLine();

        try (PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO products (product_id, product_name, product_price, product_quantity, product_company) " +
                        "VALUES (?, ?, ?, ?, ?)")) {
            stmt.setInt(1, productId);
            stmt.setString(2, productName);
            stmt.setDouble(3, productPrice);
            stmt.setInt(4, productQuantity);
            stmt.setString(5, productCompany);
            stmt.executeUpdate();
            System.out.println("Product added successfully!\n");
        }
    }

    private static void viewStock() throws SQLException {
        System.out.println("------ View Stock ------");
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM products")) {
            if (!rs.next()) {
                System.out.println("No products in the inventory.\n");
            } else {
                do {
                    System.out.println("Product ID: " + rs.getInt("product_id"));
                    System.out.println("Product Name: " + rs.getString("product_name"));
                    System.out.println("Product Price: " + rs.getDouble("product_price"));
                    System.out.println("Product Quantity: " + rs.getInt("product_quantity"));
                    System.out.println("Product Company: " + rs.getString("product_company"));
                    System.out.println("------------------------");
                } while (rs.next());
            }
        }
    }

    private static void searchStock() throws SQLException {
        System.out.println("------ Search Stock ------");
        System.out.print("Enter Product ID to search: ");
        int searchProductId = sc.nextInt();
        sc.nextLine(); 

        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products WHERE product_id = ?")) {
            stmt.setInt(1, searchProductId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (!rs.next()) {
                    System.out.println("Product with ID " + searchProductId + " not found.\n");
                } else {
                    System.out.println("Product found:");
                    System.out.println("Product ID: " + rs.getInt("product_id"));
                    System.out.println("Product Name: " + rs.getString("product_name"));
                    System.out.println("Product Price: " + rs.getDouble("product_price"));
                    System.out.println("Product Quantity: " + rs.getInt("product_quantity"));
                    System.out.println("Product Company: " + rs.getString("product_company"));
                    System.out.println("------------------------");
                }
            }
        }
    }

    private static void editStock() throws SQLException {
        System.out.println("------ Edit Stock ------");
        System.out.print("Enter Product ID to edit: ");
        int editProductId = sc.nextInt();
        sc.nextLine(); 

        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products WHERE product_id = ?")) {
            stmt.setInt(1, editProductId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (!rs.next()) {
                    System.out.println("Product with ID " + editProductId + " not found.\n");
                } else {
                    System.out.println("Product found. Enter new details:");

                    System.out.print("Product Name: ");
                    String productName = sc.nextLine();

                    System.out.print("Product Price: ");
                    double productPrice = sc.nextDouble();
                    sc.nextLine(); 

                    System.out.print("Product Quantity: ");
                    int productQuantity = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Product Company: ");
                    String productCompany = sc.nextLine();

                    try (PreparedStatement updateStmt = conn.prepareStatement(
                            "UPDATE products SET product_name = ?, product_price = ?, " +
                                    "product_quantity = ?, product_company = ? WHERE product_id = ?")) {
                        updateStmt.setString(1, productName);
                        updateStmt.setDouble(2, productPrice);
                        updateStmt.setInt(3, productQuantity);
                        updateStmt.setString(4, productCompany);
                        updateStmt.setInt(5, editProductId);
                        updateStmt.executeUpdate();
                        System.out.println("Product details updated successfully!\n");
                    }
                }
            }
        }
    }

    private static void deleteStock() throws SQLException {

        System.out.println("------ Delete Stock ------");
        
        System.out.print("Enter Product ID to delete: ");
        int deleteProductId = sc.nextInt();
        sc.nextLine(); 

        try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM products WHERE product_id = ?")) {

            stmt.setInt(1, deleteProductId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Product with ID " + deleteProductId + " deleted successfully!\n");
            } else {
                System.out.println("Product with ID " + deleteProductId + " not found.\n");
            }
        }
    }
}