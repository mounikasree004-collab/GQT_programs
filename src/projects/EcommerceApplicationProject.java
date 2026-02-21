package projects;
import java.util.Scanner;
public class EcommerceApplicationProject {
	    static Scanner sc = new Scanner(System.in);
	    static Cart cart = new Cart(100);
	    /* ---------- COLORS ---------- */
	    static class Colors {
	        static final String RESET = "\u001B[0m";
	        static final String RED = "\u001B[31m";
	        static final String GREEN = "\u001B[32m";
	        static final String YELLOW = "\u001B[33m";
	        static final String BLUE = "\u001B[34m";
	        static final String PURPLE = "\u001B[35m";
	        static final String CYAN = "\u001B[36m";
	        static final String BLACK = "\u001B[30m";  
	        static final String GRAY = "\u001B[90m";    
	        static final String ORANGE = "\u001B[38;5;208m";
	        static final String PINK = "\u001B[38;5;213m";   
	        static final String TEAL = "\u001B[38;5;36m";    
	        static final String MAGENTA = "\u001B[35m";      
	        static final String BROWN = "\u001B[38;5;94m"; 
	        static final String LIGHT_BLUE = "\u001B[94m";   
	        static final String LIGHT_GRAY = "\u001B[37;1m";
	    }
	    /* ---------- PRODUCT ---------- */
	    static class Product {
	        String name, brand, desc;
	        double price;
	        Product(String name, String brand, String desc, double price) {
	            this.name = name;
	            this.brand = brand;
	            this.desc = desc;
	            this.price = price;
	        }
	        public String toString() {
	            return name + " | " + brand + " | " + desc + " | ₹" + price;
	        }
	    }
	    /* ---------- CART ---------- */
	    static class Cart {
	        Product[] items;
	        int count;

	        Cart(int size) {
	            items = new Product[size];
	            count = 0;
	        }
	        void add(Product p) {
	            if(count < items.length) {
	                items[count++] = p;
	                System.out.println(Colors.GREEN + "✔ Product added to cart" + Colors.RESET);
	            } else {
	                System.out.println(Colors.RED + "Cart full!" + Colors.RESET);
	            }
	        }
	        boolean isEmpty() {
	            return count == 0;
	        }
	        void showCart() {
	            if(isEmpty()) {
	                System.out.println(Colors.RED + "\nCart is empty!" + Colors.RESET);
	                return;
	            }
	            System.out.println(Colors.YELLOW + "\n🛒 YOUR CART" + Colors.RESET);
	            double total = 0;
	            for(int i = 0; i < count; i++) {
	                System.out.println((i+1) + ". " + items[i]);
	                total += items[i].price;
	            }
	            System.out.println("Total Amount: ₹" + total);
	        }
	        void clear() {
	            count = 0;
	        }
	    }
	    
	    /* ---------- PRODUCTS ---------- */
	    static void electronicsMenu() {
	        while (true) {
	            System.out.println(Colors.PURPLE + "\n--- ELECTRONICS MENU ---" + Colors.RESET);
	            System.out.println("1. Mobiles");
	            System.out.println("2. Laptops");
	            System.out.println("3. Power Banks");
	            System.out.println("4. Kettles");
	            System.out.println("5. Back");
	            System.out.print(Colors.ORANGE+"Enter choice: ");
	            int ch = sc.nextInt();
	            switch (ch) {
	                case 1 -> showProducts("MOBILES", mobiles());
	                case 2 -> showProducts("LAPTOPS", laptops());
	                case 3 -> showProducts("POWER BANKS", powerBanks());
	                case 4 -> showProducts("KETTLES", kettles());
	                case 5 -> { return; }
	                default -> System.out.println(Colors.RED + "Invalid choice" + Colors.RESET);
	            }
	        }
	    }
	 // -------- ELECTRONICS SUB-CATEGORIES --------
	    static Product[] mobiles() {
	        return new Product[]{
	            new Product(Colors.PINK + "Samsung S23", "Samsung", "8GB RAM", 74999),
	            new Product(Colors.PINK + "iPhone 15", "Apple", "8GB RAM", 89999),
	            new Product(Colors.PINK + "OnePlus 11", "OnePlus", "12GB RAM", 61999),
	            new Product(Colors.PINK + "Pixel 7", "Google", "8GB RAM", 52999),
	            new Product(Colors.PINK + "Vivo X90", "Vivo", "12GB RAM", 59999),
	            new Product(Colors.PINK + "Oppo Reno", "Oppo", "8GB RAM", 38999),
	            new Product(Colors.PINK + "Realme GT", "Realme", "8GB RAM", 34999),
	            new Product(Colors.PINK + "Moto Edge", "Motorola", "8GB RAM", 29999),
	            new Product(Colors.PINK + "Samsung A54", "Samsung", "8GB RAM", 27999),
	            new Product(Colors.PINK + "iQOO Neo", "iQOO", "8GB RAM", 31999)
	        };
	    }
	    static Product[] laptops() {
	        return new Product[]{
	            new Product(Colors.LIGHT_BLUE + "HP Pavilion", "HP", "16GB RAM", 65999),
	            new Product(Colors.LIGHT_BLUE + "Dell Inspiron", "Dell", "8GB RAM", 54999),
	            new Product(Colors.LIGHT_BLUE + "Lenovo IdeaPad", "Lenovo", "8GB RAM", 49999),
	            new Product(Colors.LIGHT_BLUE + "MacBook Air", "Apple", "8GB RAM", 99999),
	            new Product(Colors.LIGHT_BLUE + "Asus VivoBook", "Asus", "16GB RAM", 57999),
	            new Product(Colors.LIGHT_BLUE + "Acer Aspire", "Acer", "8GB RAM", 46999),
	            new Product(Colors.LIGHT_BLUE + "MSI Modern", "MSI", "16GB RAM", 68999),
	            new Product(Colors.LIGHT_BLUE + "Samsung Galaxy Book", "Samsung", "8GB RAM", 59999),
	            new Product(Colors.LIGHT_BLUE + "HP Envy", "HP", "16GB RAM", 79999),
	            new Product(Colors.LIGHT_BLUE + "Dell XPS", "Dell", "16GB RAM", 119999)
	        };
	    }
	    static Product[] powerBanks() {
	        return new Product[]{
	            new Product(Colors.ORANGE + "Mi Power Bank", "MI", "20000mAh", 2199),
	            new Product(Colors.ORANGE + "Realme Power Bank", "Realme", "10000mAh", 1299),
	            new Product(Colors.ORANGE + "Samsung Power Bank", "Samsung", "10000mAh", 1999),
	            new Product(Colors.ORANGE + "Ambrane Power Bank", "Ambrane", "20000mAh", 1599),
	            new Product(Colors.ORANGE + "Boat Power Bank", "Boat", "10000mAh", 1499),
	            new Product(Colors.ORANGE + "OnePlus Power Bank", "OnePlus", "10000mAh", 1899),
	            new Product(Colors.ORANGE + "Syska Power Bank", "Syska", "10000mAh", 1199),
	            new Product(Colors.ORANGE + "Redmi Power Bank", "Redmi", "20000mAh", 2099),
	            new Product(Colors.ORANGE + "Portronics Power Bank", "Portronics", "10000mAh", 1399),
	            new Product(Colors.ORANGE + "URBN Power Bank", "URBN", "10000mAh", 1299)
	        };
	    }
	    static Product[] kettles() {
	        return new Product[]{
	            new Product(Colors.BROWN + "Prestige Kettle", "Prestige", "1.5 Litre", 1499),
	            new Product(Colors.BROWN + "Philips Kettle", "Philips", "1.2 Litre", 1999),
	            new Product(Colors.BROWN + "Havells Kettle", "Havells", "1.5 Litre", 1799),
	            new Product(Colors.BROWN + "Bajaj Kettle", "Bajaj", "1.5 Litre", 1399),
	            new Product(Colors.BROWN + "Pigeon Kettle", "Pigeon", "1.5 Litre", 1299),
	            new Product(Colors.BROWN + "Milton Kettle", "Milton", "1.5 Litre", 1599),
	            new Product(Colors.BROWN + "Butterfly Kettle", "Butterfly", "1.5 Litre", 1699),
	            new Product(Colors.BROWN + "Morphy Richards", "Morphy", "1.5 Litre", 2499),
	            new Product(Colors.BROWN + "Crompton Kettle", "Crompton", "1.5 Litre", 1899),
	            new Product(Colors.BROWN + "Usha Kettle", "Usha", "1.5 Litre", 1799)
	        };
	    }
	    static void homeDecorMenu() {
	        while (true) {
	            System.out.println(Colors.PURPLE + "\n--- HOME DECOR MENU ---" + Colors.RESET);
	            System.out.println("1. Wall Decor");
	            System.out.println("2. Lighting");
	            System.out.println("3. Furniture");
	            System.out.println("4. Decorative Items");
	            System.out.println("5. Back");
	            System.out.print(Colors.ORANGE+"Enter choice: ");
	            int ch = sc.nextInt();
	            switch (ch) {
	                case 1 -> showProducts(Colors.TEAL +"WALL DECOR", wallDecor());
	                case 2 -> showProducts(Colors.TEAL +"LIGHTING", lighting());
	                case 3 -> showProducts(Colors.TEAL +"FURNITURE", furniture());
	                case 4 -> showProducts(Colors.TEAL +"DECORATIVE ITEMS", decorativeItems());
	                case 5 -> { return; }
	                default -> System.out.println(Colors.RED + "Invalid choice" + Colors.RESET);
	            }
	        }
	    }
	 // -------- HOME DECOR SUB-CATEGORIES --------
	    static Product[] wallDecor() {
	        return new Product[]{
	            new Product(Colors.BLUE + "Wall Clock", "Ajanta", "Designer", 1999),
	            new Product(Colors.BLUE + "Photo Frame", "Art Street", "Wooden", 999),
	            new Product(Colors.BLUE + "Wall Art", "Art World", "Canvas", 1799),
	            new Product(Colors.BLUE + "Mirror Set", "Ikea", "Decorative", 2499),
	            new Product(Colors.BLUE + "Metal Wall Decor", "DecoCraft", "Handmade", 2999),
	            new Product(Colors.BLUE + "Hanging Plates", "Rajasthani", "Ceramic", 1599),
	            new Product(Colors.BLUE + "Wall Stickers", "Home Sparkle", "Vinyl", 799),
	            new Product(Colors.BLUE + "Wooden Panels", "WoodVilla", "Handcrafted", 3499),
	            new Product(Colors.BLUE + "Wall Shelves", "Ikea", "Wooden", 2799),
	            new Product(Colors.BLUE + "Wall Quotes Frame", "Craft Vatika", "Printed", 899)
	        };
	    }
	    static Product[] lighting() {
	        return new Product[]{
	            new Product(Colors.LIGHT_BLUE + "Table Lamp", "Philips", "LED", 2999),
	            new Product(Colors.LIGHT_BLUE + "Floor Lamp", "Philips", "LED", 3499),
	            new Product(Colors.LIGHT_BLUE + "Ceiling Light", "Syska", "LED", 2599),
	            new Product(Colors.LIGHT_BLUE + "Pendant Light", "Havells", "Modern", 3999),
	            new Product(Colors.LIGHT_BLUE + "Wall Light", "Wipro", "Warm LED", 1899),
	            new Product(Colors.LIGHT_BLUE + "Study Lamp", "Mi", "Smart LED", 2499),
	            new Product(Colors.LIGHT_BLUE + "Decorative Bulbs", "Philips", "Vintage", 1299),
	            new Product(Colors.LIGHT_BLUE + "Night Lamp", "Syska", "USB", 999),
	            new Product(Colors.LIGHT_BLUE + "Chandelier", "Havells", "Crystal", 8999),
	            new Product(Colors.LIGHT_BLUE + "Strip Lights", "Wipro", "RGB", 1499)
	        };
	    }
	    static Product[] furniture() {
	        return new Product[]{
	            new Product(Colors.BROWN + "Bookshelf", "Nilkamal", "Wooden", 4999),
	            new Product(Colors.BROWN + "Coffee Table", "Urban Ladder", "Wooden", 8999),
	            new Product(Colors.BROWN + "Sofa Chair", "HomeTown", "Single Seater", 11999),
	            new Product(Colors.BROWN + "TV Unit", "Pepperfry", "Modern", 15999),
	            new Product(Colors.BROWN + "Dining Chair", "Ikea", "Wooden", 3499),
	            new Product(Colors.BROWN + "Side Table", "Urban Ladder", "Metal", 2999),
	            new Product(Colors.BROWN + "Wardrobe", "Godrej", "2 Door", 18999),
	            new Product(Colors.BROWN + "Study Table", "Ikea", "Compact", 6999),
	            new Product(Colors.BROWN + "Shoe Rack", "Nilkamal", "Plastic", 2499),
	            new Product(Colors.BROWN + "Stool", "HomeCentre", "Wooden", 1999)
	        };
	    }
	    static Product[] decorativeItems() {
	        return new Product[]{
	            new Product(Colors.PURPLE + "Flower Vase", "Ikea", "Glass", 1499),
	            new Product(Colors.PURPLE + "Artificial Plants", "Ugaoo", "Plastic", 999),
	            new Product(Colors.PURPLE + "Showpiece", "CraftVatika", "Resin", 1299),
	            new Product(Colors.PURPLE + "Candle Stand", "Home Sparkle", "Metal", 899),
	            new Product(Colors.PURPLE + "Incense Holder", "Chumbak", "Ceramic", 699),
	            new Product(Colors.PURPLE + "Decorative Bowl", "Art India", "Wooden", 1599),
	            new Product(Colors.PURPLE + "Wind Chime", "Exotic India", "Metal", 1199),
	            new Product(Colors.PURPLE + "Table Decor", "Home Centre", "Modern", 1799),
	            new Product(Colors.PURPLE + "Idol Statue", "CraftVatika", "Polyresin", 2499),
	            new Product(Colors.PURPLE + "Wall Planter", "Trust Basket", "Metal", 1899)
	        };
	    }
	    static void fashionMenu() {
	        while (true) {
	            System.out.println(Colors.PURPLE + "\n--- FASHION MENU ---" + Colors.RESET);
	            System.out.println("1. Men's Wear");
	            System.out.println("2. Women's Wear");
	            System.out.println("3. Footwear");
	            System.out.println("4. Accessories");
	            System.out.println("5. Back");
	            System.out.print(Colors.ORANGE+"Enter choice: ");
	            int ch = sc.nextInt();
	            switch (ch) {
	                case 1 -> showProducts("MEN'S WEAR", mensWear());
	                case 2 -> showProducts("WOMEN'S WEAR", womensWear());
	                case 3 -> showProducts("FOOTWEAR", footwear());
	                case 4 -> showProducts("ACCESSORIES", fashionAccessories());
	                case 5 -> { return; }
	                default -> System.out.println(Colors.RED + "Invalid choice" + Colors.RESET);
	            }
	        }
	    }

	 // -------- FASHION SUB-CATEGORIES --------
	    static Product[] mensWear() {
	        return new Product[]{
	            new Product(Colors.YELLOW + "T-Shirt", "Puma", "L Size", 799),
	            new Product(Colors.YELLOW + "Shirt", "Levi's", "M Size", 1999),
	            new Product(Colors.YELLOW + "Jeans", "Levi's", "32 Waist", 2499),
	            new Product(Colors.YELLOW + "Jacket", "Adidas", "M Size", 2999),
	            new Product(Colors.YELLOW + "Track Pants", "Nike", "L Size", 1899),
	            new Product(Colors.YELLOW + "Kurta", "Manyavar", "Cotton", 1599),
	            new Product(Colors.YELLOW + "Hoodie", "HRX", "L Size", 2299),
	            new Product(Colors.YELLOW + "Blazer", "Raymond", "Formal", 4999),
	            new Product(Colors.YELLOW + "Shorts", "Puma", "Sports", 999),
	            new Product(Colors.YELLOW + "Sweater", "Monte Carlo", "Woolen", 2799)
	        };
	    }
	    static Product[] womensWear() {
	        return new Product[]{
	            new Product(Colors.PINK + "Kurti", "Biba", "Cotton", 1799),
	            new Product(Colors.PINK + "Saree", "Suta", "Handloom", 4999),
	            new Product(Colors.PINK + "Top", "H&M", "M Size", 1499),
	            new Product(Colors.PINK + "Jeans", "Levi's", "30 Waist", 2599),
	            new Product(Colors.PINK + "Dress", "Zara", "Party Wear", 3499),
	            new Product(Colors.PINK + "Leggings", "Jockey", "Stretchable", 999),
	            new Product(Colors.PINK + "Skirt", "Forever 21", "Casual", 1999),
	            new Product(Colors.PINK + "Palazzo", "W", "Cotton", 1699),
	            new Product(Colors.PINK + "Dupatta", "FabIndia", "Silk", 1299),
	            new Product(Colors.PINK + "Gown", "Global Desi", "Designer", 6999)
	        };
	    }
	    static Product[] footwear() {
	        return new Product[]{
	            new Product(Colors.ORANGE + "Sneakers", "Nike", "10 US", 4999),
	            new Product(Colors.ORANGE + "Running Shoes", "Adidas", "9 US", 5499),
	            new Product(Colors.ORANGE + "Formal Shoes", "Bata", "Leather", 2999),
	            new Product(Colors.ORANGE + "Sandals", "Sparx", "Casual", 1999),
	            new Product(Colors.ORANGE + "Slippers", "Puma", "Comfort", 999),
	            new Product(Colors.ORANGE + "Heels", "Catwalk", "Party Wear", 3499),
	            new Product(Colors.ORANGE + "Flats", "Metro", "Casual", 1799),
	            new Product(Colors.ORANGE + "Boots", "Woodland", "Leather", 5999),
	            new Product(Colors.ORANGE + "Loafers", "Hush Puppies", "Formal", 3999),
	            new Product(Colors.ORANGE + "Ethnic Footwear", "Mochi", "Traditional", 2499)
	        };
	    }
	    static Product[] fashionAccessories() {
	        return new Product[]{
	            new Product(Colors.MAGENTA + "Wrist Watch", "Fossil", "Analog", 3999),
	            new Product(Colors.MAGENTA + "Sunglasses", "Ray-Ban", "UV Protected", 1999),
	            new Product(Colors.MAGENTA + "Handbag", "Lavie", "Leather", 2599),
	            new Product(Colors.MAGENTA + "Wallet", "Wildcraft", "Leather", 1499),
	            new Product(Colors.MAGENTA + "Belt", "Levi's", "Leather", 899),
	            new Product(Colors.MAGENTA + "Cap", "Puma", "Adjustable", 599),
	            new Product(Colors.MAGENTA + "Scarf", "Zara", "Winter Wear", 1299),
	            new Product(Colors.MAGENTA + "Jewellery Set", "Voylla", "Fashion", 2999),
	            new Product(Colors.MAGENTA + "Bracelet", "Fossil", "Metal", 1999),
	            new Product(Colors.MAGENTA + "Hair Accessories", "Clovia", "Combo Pack", 499)
	        };
	    }
	    static void groceryMenu() {
	        while (true) {
	            System.out.println(Colors.PURPLE + "\n--- GROCERY MENU ---" + Colors.RESET);
	            System.out.println("1. Staples");
	            System.out.println("2. Dairy & Eggs");
	            System.out.println("3. Beverages");
	            System.out.println("4. Snacks & Packaged Foods");
	            System.out.println("5. Back");
	            System.out.print(Colors.ORANGE+"Enter choice: ");

	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1 -> showProducts("STAPLES", staples());
	                case 2 -> showProducts("DAIRY & EGGS", dairyAndEggs());
	                case 3 -> showProducts("BEVERAGES", beverages());
	                case 4 -> showProducts("SNACKS & PACKAGED FOODS", snacks());
	                case 5 -> { return; }
	                default -> System.out.println(Colors.RED + "Invalid choice" + Colors.RESET);
	            }
	        }
	    }

	 // -------- GROCERY SUB-CATEGORIES --------
	    static Product[] staples() {
	        return new Product[]{
	            new Product(Colors.RED + "Rice", "Daawat", "5kg Pack", 499),
	            new Product(Colors.RED + "Wheat Flour", "Aashirvaad", "5kg", 350),
	            new Product(Colors.RED + "Sugar", "Tata", "1kg", 55),
	            new Product(Colors.RED + "Salt", "Tata", "1kg", 30),
	            new Product(Colors.RED + "Toor Dal", "Tata Sampann", "1kg", 220),
	            new Product(Colors.RED + "Moong Dal", "24 Mantra", "1kg", 190),
	            new Product(Colors.RED + "Chana Dal", "Fortune", "1kg", 140),
	            new Product(Colors.RED + "Cooking Oil", "Fortune", "1L", 210),
	            new Product(Colors.RED + "Ghee", "Amul", "1L", 620),
	            new Product(Colors.RED + "Atta", "Pillsbury", "5kg", 340)
	        };
	    }
	    static Product[] dairyAndEggs() {
	        return new Product[]{
	            new Product(Colors.TEAL+"Milk", "Amul", "1L", 65),
	            new Product(Colors.TEAL+ "Curd", "Heritage", "500g", 45),
	            new Product(Colors.TEAL+"Butter", "Amul", "200g", 120),
	            new Product(Colors.TEAL+ "Cheese", "Britannia", "200g", 160),
	            new Product(Colors.TEAL+ "Paneer", "Milky Mist", "200g", 110),
	            new Product(Colors.TEAL+"Eggs", "Local Farm", "12 pcs", 120),
	            new Product(Colors.TEAL+"Fresh Cream", "Amul", "250ml", 75),
	            new Product(Colors.TEAL+ "Buttermilk", "Amul", "1L", 40),
	            new Product(Colors.TEAL+"Flavoured Milk", "Amul", "200ml", 30),
	            new Product(Colors.TEAL+"Lassi", "Mother Dairy", "1L", 85)
	        };
	    }
	    static Product[] beverages() {
	        return new Product[]{
	            new Product(Colors.ORANGE + "Tea", "Taj Mahal", "250g", 250),
	            new Product(Colors.ORANGE + "Coffee", "Nescafe", "200g", 350),
	            new Product(Colors.ORANGE + "Green Tea", "Tetley", "100g", 280),
	            new Product(Colors.ORANGE + "Soft Drink", "Coca Cola", "2L", 95),
	            new Product(Colors.ORANGE + "Fruit Juice", "Real", "1L", 130),
	            new Product(Colors.ORANGE + "Energy Drink", "Red Bull", "250ml", 125),
	            new Product(Colors.ORANGE + "Cold Coffee", "Bru", "180ml", 45),
	            new Product(Colors.ORANGE + "Lemon Drink", "Paper Boat", "250ml", 40),
	            new Product(Colors.ORANGE + "Milkshake", "Amul", "180ml", 35),
	            new Product(Colors.ORANGE + "Mineral Water", "Bisleri", "1L", 20)
	        };
	    }
	    static Product[] snacks() {
	        return new Product[]{
	            new Product(Colors.YELLOW + "Biscuits", "Britannia", "Pack of 2", 120),
	            new Product(Colors.YELLOW + "Chips", "Lays", "Family Pack", 110),
	            new Product(Colors.YELLOW + "Namkeen", "Haldiram's", "500g", 160),
	            new Product(Colors.YELLOW + "Chocolate", "Dairy Milk", "120g", 170),
	            new Product(Colors.YELLOW + "Cookies", "Sunfeast", "500g", 180),
	            new Product(Colors.YELLOW + "Instant Noodles", "Maggi", "Pack of 4", 200),
	            new Product(Colors.YELLOW + "Pasta", "Wheat O Wheat", "500g", 120),
	            new Product(Colors.YELLOW + "Peanut Butter", "Pintola", "350g", 220),
	            new Product(Colors.YELLOW + "Popcorn", "Act II", "Pack of 2", 99),
	            new Product(Colors.YELLOW + "Energy Bar", "Yoga Bar", "Pack of 6", 299)
	        };
	    }
	    static void stationeryMenu() {
	        while (true) {
	            System.out.println(Colors.PURPLE + "\n--- STATIONERY MENU ---" + Colors.RESET);
	            System.out.println("1. Writing Tools");
	            System.out.println("2. Paper Products");
	            System.out.println("3. Geometry & Measuring");
	            System.out.println("4. Office Supplies");
	            System.out.println("5. Back");
	            System.out.print(Colors.ORANGE+"Enter choice: ");

	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1 -> showProducts("WRITING TOOLS", writingTools());
	                case 2 -> showProducts("PAPER PRODUCTS", paperProducts());
	                case 3 -> showProducts("GEOMETRY & MEASURING", geometryTools());
	                case 4 -> showProducts("OFFICE SUPPLIES", officeSupplies());
	                case 5 -> { return; }
	                default -> System.out.println(Colors.RED + "Invalid choice" + Colors.RESET);
	            }
	        }
	    }

	 // -------- STATIONERY SUB-CATEGORIES --------
	    static Product[] writingTools() {
	        return new Product[]{
	            new Product(Colors.CYAN + "Ball Pen", "Reynolds", "Blue Ink", 15),
	            new Product(Colors.CYAN + "Gel Pen", "Pilot", "Black Ink", 25),
	            new Product(Colors.CYAN + "Pencil", "Nataraj", "HB", 10),
	            new Product(Colors.CYAN + "Mechanical Pencil", "Pentel", "0.5mm", 120),
	            new Product(Colors.CYAN + "Marker", "Camlin", "Permanent", 40),
	            new Product(Colors.CYAN + "Highlighter", "Camlin", "Yellow", 30),
	            new Product(Colors.CYAN + "Sketch Pen Set", "Faber-Castell", "12 Colors", 199),
	            new Product(Colors.CYAN + "Fountain Pen", "Parker", "Classic", 799),
	            new Product(Colors.CYAN + "Whiteboard Marker", "Doms", "Blue", 35),
	            new Product(Colors.CYAN + "Refill Pack", "Reynolds", "Blue", 50)
	        };
	    }
	    static Product[] paperProducts() {
	        return new Product[]{
	            new Product(Colors.MAGENTA + "Notebook", "Classmate", "200 Pages", 120),
	            new Product(Colors.MAGENTA + "Notebook", "Navneet", "300 Pages", 180),
	            new Product(Colors.MAGENTA + "Drawing Book", "Camlin", "A4 Size", 90),
	            new Product(Colors.MAGENTA + "Sticky Notes", "3M", "Multi Color", 99),
	            new Product(Colors.MAGENTA + "Notepad", "Paperkraft", "Spiral", 149),
	            new Product(Colors.MAGENTA + "Chart Paper", "Local Brand", "Pack of 10", 70),
	            new Product(Colors.MAGENTA + "Printer Paper", "JK Copier", "A4 – 500 Sheets", 299),
	            new Product(Colors.MAGENTA + "Diary", "Paperkraft", "Hardbound", 399),
	            new Product(Colors.MAGENTA + "Project File", "Solo", "A4", 60),
	            new Product(Colors. MAGENTA+ "Index Sheets", "Classmate", "Pack of 100", 110)
	        };
	    }
	    static Product[] geometryTools() {
	        return new Product[]{
	            new Product(Colors.TEAL + "Geometry Box", "Faber-Castell", "8 pcs", 150),
	            new Product(Colors.TEAL + "Scale", "Nataraj", "30 cm", 20),
	            new Product(Colors.TEAL + "Compass", "Camlin", "Metal", 45),
	            new Product(Colors.TEAL + "Divider", "Camlin", "Steel", 40),
	            new Product(Colors.TEAL + "Protractor", "Nataraj", "180 Degree", 25),
	            new Product(Colors.TEAL + "Set Squares", "Faber-Castell", "2 pcs", 60),
	            new Product(Colors.TEAL + "Maths Kit", "Classmate", "Student Kit", 199),
	            new Product(Colors.TEAL + "Measuring Tape", "Bosch", "1.5m", 120),
	            new Product(Colors.TEAL + "Mini Ruler", "Doms", "15 cm", 15),
	            new Product(Colors.TEAL + "Drafting Set", "Rotring", "Professional", 899)
	        };
	    }
	    static Product[] officeSupplies() {
	        return new Product[]{
	            new Product(Colors.GRAY + "Stapler", "KW-Trio", "Mini", 199),
	            new Product(Colors.GRAY + "Staple Pins", "Kangaro", "No.10", 40),
	            new Product(Colors.GRAY + "Paper Clips", "Solo", "Pack of 50", 60),
	            new Product(Colors.GRAY + "Glue Stick", "Fevicol", "20g", 35),
	            new Product(Colors.GRAY + "Correction Pen", "Camlin", "7ml", 45),
	            new Product(Colors.GRAY + "File Folder", "Solo", "Plastic", 90),
	            new Product(Colors.GRAY + "Pen Stand", "Cello", "Plastic", 99),
	            new Product(Colors.GRAY + "Desk Organizer", "Ikea", "Multi Slot", 799),
	            new Product(Colors.GRAY + "Clipboard", "Kores", "A4", 149),
	            new Product(Colors.GRAY + "Calculator", "Casio", "Basic", 499)
	        };
	    }
	    /* ---------- SHOW PRODUCTS ---------- */
	    static void showProducts(String title, Product[] products) {
	        while(true) {
	            System.out.println(Colors.CYAN + "\n--- " + title + " ---" + Colors.RESET);
	            for(int i = 0; i < products.length; i++) {
	                System.out.println((i+1) + ". " + products[i]);
	            }
	            System.out.println((products.length+1) + ". Back");
	            System.out.print(Colors.BLACK+"Choose product: ");
	            int ch = sc.nextInt();
	            if(ch == products.length+1) return;
	            if(ch >= 1 && ch <= products.length) {
	                Product selected = products[ch-1];
	                System.out.println(Colors.YELLOW + "1. Add to Cart");
	                System.out.println(Colors.YELLOW + "2. Buy Now");
	                System.out.print(Colors.BLACK + "Choose option: ");
	                int opt = sc.nextInt();
	                if(opt == 1) {
	                    cart.add(selected);
	                } else if(opt == 2) {
	                    checkout(selected); // direct buy
	                } else {
	                    System.out.println(Colors.RED + "Invalid option" + Colors.RESET);
	                }
	            } else {
	                System.out.println(Colors.RED + "Invalid choice" + Colors.RESET);
	            }
	        }
	    }
	 // ---------- BILL DETAILS ----------
	    static void showBillDetails(double totalAmount) {
	        double discount = 25;              // fixed discount like Flipkart
	        double gst = totalAmount * 0.05;   // 5% GST
	        double finalAmount = totalAmount - discount + gst;

	        System.out.println("\n========== PRICE DETAILS ==========");
	        System.out.println("Total Product Price : + ₹" + totalAmount);
	        System.out.println("Total Discounts     : - ₹" + discount);
	        System.out.println("GST (5%)            : + ₹" + gst);
	        System.out.println("-----------------------------------");
	        System.out.println("Order Total         : ₹" + finalAmount);
	    }


	    /* ---------- CHECKOUT ---------- */
	    static void checkout(Product p) {
	    	System.out.print("\nEnter Delivery Address: ");
	    	sc.nextLine();               // clear buffer
	    	String address = sc.nextLine();
	        if (p == null && cart.isEmpty()) {
	            System.out.println(Colors.RED + "\nCart is empty! Nothing to checkout." + Colors.RESET);
	            return;
	        }
	        System.out.println(Colors.GREEN + "\n===== CHECKOUT =====" + Colors.RESET);

	        if (p != null) {
	            System.out.println(p);
	            System.out.println("Total Amount: ₹" + p.price);
	            showBillDetails(p.price);

	        } else {
	            cart.showCart();
	        };
	        System.out.println(Colors.GREEN +"\n1. UPI");
	        System.out.println(Colors.GREEN +"2. Net Banking");
	        System.out.print(Colors.GREEN +"Choose payment method: ");
	        int paymentChoice = sc.nextInt();
	        sc.nextLine(); // clear buffer
	        // ---------- UPI ----------
	        if (paymentChoice == 1) {
	            System.out.println(Colors.BROWN + "\nChoose UPI App:");
	            System.out.println(Colors.PINK + "1. PhonePe");
	            System.out.println(Colors.PINK + "2. Google Pay");
	            System.out.print("Enter choice: ");
	            int upiChoice = sc.nextInt();
	            sc.nextLine();
	            if (upiChoice == 1 || upiChoice == 2) {
	                System.out.print("Enter UPI ID: ");
	                String upiId = sc.nextLine();
	                if (upiChoice == 1)
	                    System.out.println("Redirecting to PhonePe...");
	                else
	                    System.out.println("Redirecting to Google Pay...");

	                System.out.println(Colors.GREEN + "✔ Payment Successful! Order Confirmed" + Colors.RESET);
	                cart.clear();
	            } else {
	                System.out.println(Colors.RED + "Invalid UPI option" + Colors.RESET);
	            }
	        }
	        // ---------- NET BANKING ----------
	        else if (paymentChoice == 2) {
	            System.out.println(Colors.BROWN + "\nChoose Bank:");
	            System.out.println("1. SBI");
	            System.out.println("2. HDFC");
	            System.out.println("3. ICICI");
	            System.out.println("4. CANARA");
	            System.out.println("5. IPBS");
	            System.out.println("6. UNION");
	            System.out.print("Enter choice: ");
	            int bankChoice = sc.nextInt();
	            sc.nextLine();
	            if (bankChoice >= 1 && bankChoice <= 6) {
	                System.out.print("Enter Account Number: ");
	                String acc = sc.nextLine();

	                System.out.print("Enter IFSC Code: ");
	                String ifsc = sc.nextLine();

	                System.out.println("Redirecting to Bank...");
	                System.out.println(Colors.GREEN + "✔ Payment Successful! Order Confirmed" + Colors.RESET);
	                cart.clear();
	            } else {
	                System.out.println(Colors.RED + "Invalid Bank option" + Colors.RESET);
	            }
	        }
	        else {
	            System.out.println(Colors.RED + "Invalid payment choice" + Colors.RESET);
	        }
	    }
	    /* ---------- MAIN ---------- */
	    public static void main(String[] args) {
	        while(true) {
	            System.out.println(Colors.PURPLE + "\n===== MAIN MENU =====" + Colors.RESET);
	            System.out.println("1. Electronics");
	            System.out.println("2. Home Decor");
	            System.out.println("3. Fashion");
	            System.out.println("4. Groceries");
	            System.out.println("5. Stationery");
	            System.out.println("6. Checkout");
	            System.out.println("7. Exit");
	            System.out.print(Colors.ORANGE+"Enter choice: ");
	            int choice = sc.nextInt();
	            switch(choice) {
	            	case 1 -> electronicsMenu();
	            	case 2 -> homeDecorMenu();
	            	case 3 -> fashionMenu();
	            	case 4 -> groceryMenu();
	            	case 5 -> stationeryMenu();
	                case 6 -> checkout(null); // checkout all cart items
	                case 7 ->{
	                    System.out.println(Colors.BLUE + "Thank you for shopping!" + Colors.RESET);
	                    return;
	                }
	                default -> System.out.println(Colors.RED + "Invalid choice" + Colors.RESET);
	            }
	        }
	    }
	}
