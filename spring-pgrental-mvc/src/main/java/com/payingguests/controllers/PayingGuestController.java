package com.payingguests.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.payingguests.model.PayingGuest;
import com.payingguests.service.IPayingGuestService;

@Controller
public class PayingGuestController {

	private IPayingGuestService payingGuestService;
	public PayingGuestController(IPayingGuestService payingGuestService) {
		super();
		this.payingGuestService = payingGuestService;
	}

	@RequestMapping("add-pg")
	public String addPayingGuest(PayingGuest payingGuest) {
		payingGuestService.addPayingGuest(payingGuest);
		return "success";
	}

	@RequestMapping("/")
	public String showAll(Model model) {
		List<PayingGuest> payingGuests = payingGuestService.getAllPayingGuest();
		model.addAttribute("payingGuests", payingGuests);
		return "home";
	}

	@RequestMapping("pg-category")
	public String searchByCategory(@RequestParam("choice") String choice, Model model) {
		List<PayingGuest> payingGuests = payingGuestService.getPayingGuestByCategory(choice);
		model.addAttribute("search", payingGuests);
		return "success";
	}
	
	@RequestMapping("pg-location")
	public String searchByLocation(@RequestParam("choice") String choice, Model model) {
		List<PayingGuest> payingGuests = payingGuestService.getPayingGuestByLocation(choice);
		model.addAttribute("search", payingGuests);
		return "success";
	}
}
