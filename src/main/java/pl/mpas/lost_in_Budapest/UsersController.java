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

    @GetMapping("/hungarianExpressions")
    public String getExpressionsPage() {return "hungarianExpressions";}

    @GetMapping("/partyEvents")
    public String getPartyOption() {return "partyEvents";}

    @GetMapping("/studyEvents")
    public String getStudyEvents() {return "studyEvents";}

    @GetMapping("/culturalEvents")
    public String getCulturalEvents() {return "culturalEvents";}

    @GetMapping("/newEventAddition")
    public String getNewEvent() {return "newEventAddition";}

}
