package io.deniskisina.coronavirustracker.controllers;

import io.deniskisina.coronavirustracker.models.LocationStatistics;
import io.deniskisina.coronavirustracker.service.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){

        List<LocationStatistics> allStats = coronaVirusDataService.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalReport()).sum();

        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalCases);
        return "home";
    }
}
