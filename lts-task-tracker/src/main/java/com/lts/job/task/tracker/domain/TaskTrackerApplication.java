package com.lts.job.task.tracker.domain;

import com.lts.job.core.Application;
import com.lts.job.core.constant.Level;
import com.lts.job.core.remoting.RemotingClientDelegate;
import com.lts.job.task.tracker.runner.RunnerFactory;
import com.lts.job.task.tracker.runner.RunnerPool;
import com.lts.job.task.tracker.support.JobPullMachine;

/**
 * @author Robert HG (254963746@qq.com) on 3/30/15.
 */
public class TaskTrackerApplication extends Application{

    private RemotingClientDelegate remotingClient;
    /**
     * runner 线程池
     */
    private RunnerPool runnerPool;

    private RunnerFactory runnerFactory;

    private JobPullMachine jobPullMachine;
    /**
     * 业务日志记录级别
     */
    private Level bizLogLevel;
    /**
     * 执行任务的class
     */
    private Class jobRunnerClass;

    public RunnerPool getRunnerPool() {
        return runnerPool;
    }

    public void setRunnerPool(RunnerPool runnerPool) {
        this.runnerPool = runnerPool;
    }

    public Level getBizLogLevel() {
        return bizLogLevel;
    }

    public void setBizLogLevel(Level bizLogLevel) {
        this.bizLogLevel = bizLogLevel;
    }

    public Class getJobRunnerClass() {
        return jobRunnerClass;
    }

    public void setJobRunnerClass(Class jobRunnerClass) {
        this.jobRunnerClass = jobRunnerClass;
    }

    public RunnerFactory getRunnerFactory() {
        return runnerFactory;
    }

    public void setRunnerFactory(RunnerFactory runnerFactory) {
        this.runnerFactory = runnerFactory;
    }

    public RemotingClientDelegate getRemotingClient() {
        return remotingClient;
    }

    public void setRemotingClient(RemotingClientDelegate remotingClient) {
        this.remotingClient = remotingClient;
    }

    public JobPullMachine getJobPullMachine() {
        return jobPullMachine;
    }

    public void setJobPullMachine(JobPullMachine jobPullMachine) {
        this.jobPullMachine = jobPullMachine;
    }
}