package insat.amin.controllers.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import insat.amin.api.v1.model.CustomerDTO;
import insat.amin.api.v1.model.CustomerListDTO;
import insat.amin.services.CustomerService;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CustomerListDTO getListOfCustomers(){
        return new CustomerListDTO(customerService.getAllCustomers());
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO createNewCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.createNewCustomer(customerDTO);
    }

    @PutMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomerByDTO(id, customerDTO);
    }

    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO patchCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        return customerService.patchCustomer(id, customerDTO);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomerById(id);
    }
}

//@Controller
//@RequestMapping(CustomerController.BASE_URL)
//public class CustomerController {
//    public static final String BASE_URL = "/api/v1/customers";
//
//    private final CustomerService customerService;
//
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//    @GetMapping
//    public ResponseEntity<CustomerListDTO> getListofCustomers(){
//
//        return new ResponseEntity<CustomerListDTO>(new CustomerListDTO(customerService.getAllCustomers()),
//                HttpStatus.OK);
//
//    }
//
//    @GetMapping({"/{id}"})
//    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id){
//        return new ResponseEntity<CustomerDTO>(customerService.getCustomerById(id), HttpStatus.OK);
//    }
//
//
//    @PostMapping
//    public ResponseEntity<CustomerDTO> createNewCustomer(@RequestBody CustomerDTO customerDTO){
//        return new ResponseEntity<CustomerDTO>(customerService.createNewCustomer(customerDTO),
//                HttpStatus.CREATED);
//    }
//
//    @PutMapping({"/{id}"})
//    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
//        return new ResponseEntity<CustomerDTO>(customerService.saveCustomerByDTO(id, customerDTO),
//                HttpStatus.OK);
//    }
//
//    @PatchMapping({"/{id}"})
//    public ResponseEntity<CustomerDTO> patchCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
//        return new ResponseEntity<CustomerDTO>(customerService.patchCustomer(id, customerDTO),
//                HttpStatus.OK);
//    }
//
//    @DeleteMapping({"/{id}"})
//    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id){
//
//        customerService.deleteCustomerById(id);
//
//        return new ResponseEntity<Void>(HttpStatus.OK);
//    }
//}
