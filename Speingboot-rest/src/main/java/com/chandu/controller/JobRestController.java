package com.chandu.controller;

import com.chandu.model.Job;
import com.chandu.service.JobService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

	/*
	 * @GetMapping("/jobs") public String viewJobs(Model model) {
	 * model.addAttribute("jobs", jobService.getAllJobs()); return "view-jobs"; //
	 * returns the view named "view-jobs.jsp" }
	 * 
	 * @GetMapping("/addJob") public String showAddJobForm(Model model) {
	 * model.addAttribute("job", new Job()); return "add-job"; // returns the view
	 * named "add-job.jsp" }
	 * 
	 * @PostMapping("/addJob") public String addJob(@ModelAttribute Job job) {
	 * jobService.saveJob(job); return "redirect:/jobs"; // Redirects to the jobs
	 * list after adding }
	 */
    
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    
    @GetMapping("jobPosts")
    public List<Job> getAllJobs() {
    	return jobService.getAllJobs();
    }
    
    
    @GetMapping("jobPost/{postId}")
    public Job getJob(@PathVariable("postId") int postId) {
    	return jobService.getJob(postId);
    }
    
    
    @PostMapping("/addJob")
    public Job addJob(@RequestBody Job job) {
        
        jobService.addJob(job);
        return job;
    }

    
}
