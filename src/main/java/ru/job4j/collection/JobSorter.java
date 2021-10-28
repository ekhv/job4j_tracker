package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("A", 1),
                new Job("B", 4),
                new Job("C", 2),
                new Job("D", 0)
        );
        Collections.sort(jobs, new JobDescByNamDescending());
        for (Job job: jobs) {
            System.out.println(job);
        }
    }
    public List<Job> getJobDescByNameAscending(List<Job> jobs) {
        return Collections.sort(jobs, new JobDescByNamDescending());
    }

}