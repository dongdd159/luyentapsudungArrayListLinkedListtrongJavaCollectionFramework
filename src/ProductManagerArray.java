import java.util.*;
public class ProductManagerArray implements Comparator<Product> {
    ArrayList<Product> list = new ArrayList<Product>();
    public ProductManagerArray(ArrayList<Product> list) {
        this.list = list;
    }
    public void add(Product product){
        list.add(product);
    }
    public void setProductinfor(Integer id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá:");
        Double price = scanner.nextDouble();
        for (Product pro : list){
            if (pro.getId() == id){
                pro.setName(name);
                pro.setPrice(price);
            }
        }
    }
    public boolean removeProduct(Integer id){
        for (Product pro : list){
            if (pro.getId() == id){
                if (list.remove(pro)){
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "ProductManager{" +
                "list=" + list +
                '}';
    }
    public Product getProduct(String name){
        for (Product pro : list){
            if (pro.getName() == name){
                return pro;
            }
        }
        return null;
    }
    @Override
    public int compare(Product product1, Product product2) {
        if(product1.getPrice() > product2.getPrice()){
            return 1;
        }else if(product1.getPrice() == product2.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }
}
