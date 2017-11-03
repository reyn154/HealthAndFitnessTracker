package org.reyn.healthfitness.controllers;

import org.reyn.healthfitness.models.CustomUserDetails;
import org.reyn.healthfitness.models.NutritionalInfo;
import org.reyn.healthfitness.services.NutritionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NutritionLogController {
	
	@Autowired
    private NutritionLogService nutritionLogService;
	
	@RequestMapping(value="/log", method = RequestMethod.GET)
	public ModelAndView log(){
		ModelAndView modelAndView = new ModelAndView();
		NutritionalInfo info = new NutritionalInfo();
		modelAndView.addObject("info", info);
		modelAndView.setViewName("nutritionalLog");
		return modelAndView;
	}
    
    @RequestMapping(value = "/log", method = RequestMethod.POST)
	public ModelAndView createNewLog(NutritionalInfo info, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		CustomUserDetails user = (CustomUserDetails)authentication.getPrincipal();
		info.setUserID(user.getUser().getId());

		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("nutritionalLog");
		} else {
			nutritionLogService.save(info);
			modelAndView.addObject("successMessage", "User has been registered successfully");
			modelAndView.addObject("info", new NutritionalInfo());
			modelAndView.setViewName("nutritionalLog");
			
		}
		return modelAndView;
	}

}
