package com.example.demo4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.model.Job;
import com.example.demo4.service.JobService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("/job")
    public Job addJob(@RequestBody Job job) {// returns added w
        return jobService.addJob(job);// call service class
    }

    @GetMapping("/getjob")
    public List<Job> getJob() {
        return jobService.getJob();// call service
    }

    @GetMapping("/job/{jobId}")
    public Optional<Job> getJobById(@PathVariable Long jobId) {
        return jobService.getJobById(jobId);
    }
}

// package com.example.springapp.controller;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.springapp.model.Job;
// import com.example.springapp.service.JobService;

// // import com.example.demo.model.Job;
// // import com.example.demo.service.JobService;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;


// @RestController
// public class JobController {
//     @Autowired
//     JobService jobservice;
//     @PostMapping("/api/job")
//     public ResponseEntity<Job> addjobs(@RequestBody Job job)
//     {
//         return new ResponseEntity<>(jobservice.addJob(job),HttpStatus.CREATED);
//     }
//     @GetMapping("/api/job")
//     public List<Job> getjobs()
//     {
//         return jobservice.getJob();
//     }
//     @GetMapping("/api/job/{jobId}")
//     public Optional<Job> getById(@PathVariable int jobId)
//     {
//         return  jobservice.getById(jobId);
         
//     }

    
    
// }