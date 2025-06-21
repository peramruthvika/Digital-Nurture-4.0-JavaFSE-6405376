package week1.DesignPatternsAndPrinciples.DependencyInjection;
public class CustomerService {
    private CustomerRepository repo;
    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }
    public void getCustomer(int id) {
        System.out.println(repo.findCustomerById(id));
    }
}