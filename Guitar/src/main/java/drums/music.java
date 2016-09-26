package drums;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller


public class music 
{
	@RequestMapping("/")
	public String printHello(ModelMap model){
		model.addAttribute("message","safety first!");
			return "NewFile2";
	}

	
    @RequestMapping("/NewFile1")
	public String printhi(ModelMap model){
		model.addAttribute("message","safety first!");
			return "NewFile1";
    }
    
    
    
    @RequestMapping("/NewFile")
	public String printwelcome(ModelMap model){
		model.addAttribute("message","safety first!");
			return "NewFile";
    }
}
