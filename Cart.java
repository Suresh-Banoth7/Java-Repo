public class Cart {

    public static void main(String[]args){
      
        Cart cart = new Cart();

        cart.addToCart();
        cart.deleteCart();
        cart.updateCart();
  
      }

      public void addToCart(){
        System.out.println("added to cart");
      }
      public void updateCart(){
        System.out.println("updated to cart");
      }
      public void deleteCart(){
        System.out.println(" deleted");
      }
    
}
