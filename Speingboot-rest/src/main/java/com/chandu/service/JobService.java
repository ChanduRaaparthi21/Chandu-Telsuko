 package com.chandu.service;

import com.chandu.model.Job;
import com.chandu.repo.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public void addJob(Job job) {
        jobRepository.addJob(job);
    }

	public Job getJob(int postId) {
		// TODO Auto-generated method stub
		return jobRepository.getJob(postId);
	}

	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		jobRepository.updateJob(job);
		
	}

	public void deleteJob(int postId) {
		// TODO Auto-generated method stub
		jobRepository.deleteById(postId);
		
	}
}

	
