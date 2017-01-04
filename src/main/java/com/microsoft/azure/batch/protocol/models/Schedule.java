/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * The schedule according to which jobs will be created.
 */
public class Schedule {
    /**
     * The earliest time at which any job may be created under this job
     * schedule.
     * If you do not specify a doNotRunUntil time, the schedule becomes ready
     * to create jobs immediately.
     */
    private DateTime doNotRunUntil;

    /**
     * A time after which no job will be created under this job schedule. The
     * schedule will move to the completed state as soon as this deadline is
     * past and there is no active job under this job schedule.
     * If you do not specify a doNotRunAfter time, and you are creating a
     * recurring job schedule, the job schedule will remain active until you
     * explicitly terminate it.
     */
    private DateTime doNotRunAfter;

    /**
     * The time interval, starting from the time at which the schedule
     * indicates a job should be created, within which a job must be created.
     * If a job is not created within the startWindow interval, then the
     * 'opportunity' is lost; no job will be created until the next
     * recurrence of the schedule. If the schedule is recurring, and the
     * startWindow is longer than the recurrence interval, then this is
     * equivalent to an infinite startWindow, because the job that is 'due'
     * in one recurrenceInterval is not carried forward into the next
     * recurrence interval. The default is infinite. The minimum value is 1
     * minute. If you specify a lower value, the Batch service rejects the
     * schedule with an error; if you are calling the REST API directly, the
     * HTTP status code is 400 (Bad Request).
     */
    private Period startWindow;

    /**
     * The time interval between the start times of two successive jobs under
     * the job schedule. A job schedule can have at most one active job under
     * it at any given time.
     * Because a job schedule can have at most one active job under it at any
     * given time, if it is time to create a new job under a job schedule,
     * but the previous job is still running, the Batch service will not
     * create the new job until the previous job finishes. If the previous
     * job does not finish within the startWindow period of the new
     * recurrenceInterval, then no new job will be scheduled for that
     * interval. For recurring jobs, you should normally specify a
     * jobManagerTask in the jobSpecification. If you do not use
     * jobManagerTask, you will need an external process to monitor when jobs
     * are created, add tasks to the jobs and terminate the jobs ready for
     * the next recurrence. The default is that the schedule does not recur:
     * one job is created, within the startWindow after the doNotRunUntil
     * time, and the schedule is complete as soon as that job finishes. The
     * minimum value is 1 minute. If you specify a lower value, the Batch
     * service rejects the schedule with an error; if you are calling the
     * REST API directly, the HTTP status code is 400 (Bad Request).
     */
    private Period recurrenceInterval;

    /**
     * Get the doNotRunUntil value.
     *
     * @return the doNotRunUntil value
     */
    public DateTime doNotRunUntil() {
        return this.doNotRunUntil;
    }

    /**
     * Set the doNotRunUntil value.
     *
     * @param doNotRunUntil the doNotRunUntil value to set
     * @return the Schedule object itself.
     */
    public Schedule withDoNotRunUntil(DateTime doNotRunUntil) {
        this.doNotRunUntil = doNotRunUntil;
        return this;
    }

    /**
     * Get the doNotRunAfter value.
     *
     * @return the doNotRunAfter value
     */
    public DateTime doNotRunAfter() {
        return this.doNotRunAfter;
    }

    /**
     * Set the doNotRunAfter value.
     *
     * @param doNotRunAfter the doNotRunAfter value to set
     * @return the Schedule object itself.
     */
    public Schedule withDoNotRunAfter(DateTime doNotRunAfter) {
        this.doNotRunAfter = doNotRunAfter;
        return this;
    }

    /**
     * Get the startWindow value.
     *
     * @return the startWindow value
     */
    public Period startWindow() {
        return this.startWindow;
    }

    /**
     * Set the startWindow value.
     *
     * @param startWindow the startWindow value to set
     * @return the Schedule object itself.
     */
    public Schedule withStartWindow(Period startWindow) {
        this.startWindow = startWindow;
        return this;
    }

    /**
     * Get the recurrenceInterval value.
     *
     * @return the recurrenceInterval value
     */
    public Period recurrenceInterval() {
        return this.recurrenceInterval;
    }

    /**
     * Set the recurrenceInterval value.
     *
     * @param recurrenceInterval the recurrenceInterval value to set
     * @return the Schedule object itself.
     */
    public Schedule withRecurrenceInterval(Period recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
        return this;
    }

}
