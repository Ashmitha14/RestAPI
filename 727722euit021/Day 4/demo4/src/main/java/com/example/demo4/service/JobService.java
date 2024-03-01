package com.example.demo4.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo4.model.Job;
import com.example.demo4.repositary.JobRepo;
@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public Job addJob(Job job)
    {
        return jobRepo.save(job);
    }
    public List<Job> getJob()
    {
        return jobRepo.findAll();
    }
    public Optional<Job> getJobById(Long id)
    {
     return jobRepo.findById(id);
    }
}


// package com.example.springapp.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.springapp.model.Job;
// import com.example.springapp.repository.JobRepo;

// // import com.example.demo.model.Job;
// // import com.example.demo.repository.JobRepo;

// @Service
// public class JobService {
//     @Autowired
//     JobRepo jobrepo;
//     public Job addJob(Job job)
//     {
//         return jobrepo.save(job);
        
//     }
//     public List<Job> getJob()
//     {
//         return jobrepo.findAll();
//     }
//     public Optional<Job> getById(int id)
//     {
//         return jobrepo.findById(id);
//     }
    
// }




