package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04_Orders {
    public static class Order {
        String product;
        Double price;
        int quantity;

        public Order(String product, Double price, int quantity) {
            this.product = product;
            this.price = price;
            this.quantity = quantity;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        //List<Order> orderList = new ArrayList<>();
        Map<String, Double> priceMap = new LinkedHashMap();
        Map<String, Integer> quantityMap = new LinkedHashMap();

        while (!inputText.equals("buy")) {
            List<String> inputList = Arrays
                    .stream(inputText.split("\\s+"))
                    .collect(Collectors.toList());

            String name = inputList.get(0);
            Double price = Double.parseDouble(inputList.get(1));
            int quantity = Integer.parseInt(inputList.get(2));

            if (!priceMap.containsKey(name)) {
                priceMap.put(name, price);
                quantityMap.put(name, quantity);
            } else {
                priceMap.replace(name, priceMap.get(name), price);
                quantityMap.replace(name, quantityMap.get(name) + quantity);
            }


            //Order orderInput = new Order(name, price, quantity);
            //  System.out.println(orderInput.getProduct());
            //if (orderList.isEmpty()) {
            //    orderList.add(orderInput);
            // } else {
            //    for (Order o : orderList) {
            //       if (!o.getProduct().equals(name)) {
            //           orderList.add(orderInput);
            //       } else if (o.getProduct().equals(name)) {
            //update
            //           int currentQuantity = o.getQuantity();
            //            o.setQuantity(currentQuantity + quantity);
            //            o.setPrice(price);
            //        }
            //    }
            // }

            inputText = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> q : quantityMap.entrySet()) {
            for (Map.Entry<String, Double> p : priceMap.entrySet()) {
                if (q.getKey().equals(p.getKey())) {
                    System.out.printf("%s -> %.2f%n", q.getKey(), q.getValue() *p.getValue());
                }
            }
        }
    }
}
