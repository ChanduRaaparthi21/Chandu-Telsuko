package com.chandu.repo;

import org.springframework.stereotype.Repository;

import com.chandu.model.Job;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class JobRepository {
    private List<Job> jobs = new ArrayList<>();

    public JobRepository() {
        jobs.add(new Job(1, "Software Engineer", "Develop and maintain software applications", 2, List.of("Java", "Spring Boot", "MySQL")));
        jobs.add(new Job(2, "Frontend Developer", "Design and implement user interfaces", 3, List.of("HTML", "CSS", "JavaScript", "React")));
        jobs.add(new Job(3, "Data Analyst", "Analyze data to provide business insights", 1, List.of("Python", "Pandas", "SQL")));
    }

    public List<Job> findAll() {
        return jobs;
    }

    public Optional<Job> findById(int id) {
        return jobs.stream().filter(job -> job.getPostId() == id).findFirst();
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public void deleteById(int id) {
        jobs.removeIf(job -> job.getPostId() == id);
    }

	public Job getJob(int postId) {
		// TODO Auto-generated method stub
		for(Job job: jobs) {
			if(job.getPostId()== postId)
		
		return job;
		}
		return null;
	}

	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		for(Job job1 : jobs) {
			if(job1.getPostId()== job.getPostId()) {
				job1.setPostProfile(job.getPostProfile());
				job1.setPostDesc(job.getPostDesc());
				job1.setReqExperience(job.getReqExperience());
				job1.setPostTechStack(job.getPostTechStack());
			}
			
		}
		
	}
}
