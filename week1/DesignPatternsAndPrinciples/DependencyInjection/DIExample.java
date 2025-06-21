package week1.DesignPatternsAndPrinciples.DependencyInjection;
public class DIExample {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);
        service.getCustomer(55);
    }
}