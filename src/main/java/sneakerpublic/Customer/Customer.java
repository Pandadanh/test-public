package sneakerpublic.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private Long customerId;

    private String name;

    private String lastName;

    private String email;
}
