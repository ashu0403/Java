class SellingPrice {
    public static void main(String[] args) {
        String itemName = "Kaisa Bowl";
        float sellingPrice = 10.99f;
        float revisedSellingPrice = (float) ((10.99f * 5f / 100f) + sellingPrice);
        System.out.println(
                "Revised Selling Price for Rounded Kaisa Bowl is $" + revisedSellingPrice);
    }

}
