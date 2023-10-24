package sneakerpublic.Customer;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class CutomerController {

    private static final List<Customer> CUSTOMER_LIST = List.of(
        new Customer(1L,"jopnhn","doe","abc"),
        new Customer(2L,"dasds","gd","abcd"),
        new Customer(3L,"gsasd","aa","abce"),
        new Customer(4L,"wqewq","cc","abcf")
    );
@GetMapping
    public List<Customer> findAllCustomer(){
        return  CUSTOMER_LIST;
    }
}
