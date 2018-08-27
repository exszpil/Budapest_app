package pl.mpas.lost_in_Budapest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/home")
    public String getPage(){ return "home"; }

    @GetMapping("/userPage")
    public String getUserPage() { return "userPage"; }

    @GetMapping("/adminPage")
    public String getAdminPage() {return "adminPage";}

    @GetMapping("loginAdmin")
    public String getAdminLoginPage() {return "loginAdmin";}

    @GetMapping("/loginUser")
    public String getUserLoginPage() {return "loginUser";}

    @GetMapping("/403")
    public String getAccessDeniadPage() {return "403";}

}
