# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateJobRunDetails(object):
    """
    The data to create a job run.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateJobRunDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this CreateJobRunDetails.
        :type key: str

        :param job_key:
            The value to assign to the job_key property of this CreateJobRunDetails.
        :type job_key: str

        :param original_attempt_run_id:
            The value to assign to the original_attempt_run_id property of this CreateJobRunDetails.
        :type original_attempt_run_id: str

        :param schedule:
            The value to assign to the schedule property of this CreateJobRunDetails.
        :type schedule: oci.aidataplatform_dp.models.Schedule

        :param parameters:
            The value to assign to the parameters property of this CreateJobRunDetails.
        :type parameters: list[oci.aidataplatform_dp.models.Parameter]

        :param queue:
            The value to assign to the queue property of this CreateJobRunDetails.
        :type queue: oci.aidataplatform_dp.models.Queue

        :param repair_history:
            The value to assign to the repair_history property of this CreateJobRunDetails.
        :type repair_history: list[oci.aidataplatform_dp.models.RepairHistory]

        """
        self.swagger_types = {
            'key': 'str',
            'job_key': 'str',
            'original_attempt_run_id': 'str',
            'schedule': 'Schedule',
            'parameters': 'list[Parameter]',
            'queue': 'Queue',
            'repair_history': 'list[RepairHistory]'
        }

        self.attribute_map = {
            'key': 'key',
            'job_key': 'jobKey',
            'original_attempt_run_id': 'originalAttemptRunId',
            'schedule': 'schedule',
            'parameters': 'parameters',
            'queue': 'queue',
            'repair_history': 'repairHistory'
        }

        self._key = None
        self._job_key = None
        self._original_attempt_run_id = None
        self._schedule = None
        self._parameters = None
        self._queue = None
        self._repair_history = None

    @property
    def key(self):
        """
        Gets the key of this CreateJobRunDetails.
        The OCID of the job.


        :return: The key of this CreateJobRunDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this CreateJobRunDetails.
        The OCID of the job.


        :param key: The key of this CreateJobRunDetails.
        :type: str
        """
        self._key = key

    @property
    def job_key(self):
        """
        **[Required]** Gets the job_key of this CreateJobRunDetails.
        The OCID of the job.


        :return: The job_key of this CreateJobRunDetails.
        :rtype: str
        """
        return self._job_key

    @job_key.setter
    def job_key(self, job_key):
        """
        Sets the job_key of this CreateJobRunDetails.
        The OCID of the job.


        :param job_key: The job_key of this CreateJobRunDetails.
        :type: str
        """
        self._job_key = job_key

    @property
    def original_attempt_run_id(self):
        """
        Gets the original_attempt_run_id of this CreateJobRunDetails.
        The OCID of the job.


        :return: The original_attempt_run_id of this CreateJobRunDetails.
        :rtype: str
        """
        return self._original_attempt_run_id

    @original_attempt_run_id.setter
    def original_attempt_run_id(self, original_attempt_run_id):
        """
        Sets the original_attempt_run_id of this CreateJobRunDetails.
        The OCID of the job.


        :param original_attempt_run_id: The original_attempt_run_id of this CreateJobRunDetails.
        :type: str
        """
        self._original_attempt_run_id = original_attempt_run_id

    @property
    def schedule(self):
        """
        Gets the schedule of this CreateJobRunDetails.

        :return: The schedule of this CreateJobRunDetails.
        :rtype: oci.aidataplatform_dp.models.Schedule
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """
        Sets the schedule of this CreateJobRunDetails.

        :param schedule: The schedule of this CreateJobRunDetails.
        :type: oci.aidataplatform_dp.models.Schedule
        """
        self._schedule = schedule

    @property
    def parameters(self):
        """
        Gets the parameters of this CreateJobRunDetails.
        An optional list of parameters.


        :return: The parameters of this CreateJobRunDetails.
        :rtype: list[oci.aidataplatform_dp.models.Parameter]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """
        Sets the parameters of this CreateJobRunDetails.
        An optional list of parameters.


        :param parameters: The parameters of this CreateJobRunDetails.
        :type: list[oci.aidataplatform_dp.models.Parameter]
        """
        self._parameters = parameters

    @property
    def queue(self):
        """
        Gets the queue of this CreateJobRunDetails.

        :return: The queue of this CreateJobRunDetails.
        :rtype: oci.aidataplatform_dp.models.Queue
        """
        return self._queue

    @queue.setter
    def queue(self, queue):
        """
        Sets the queue of this CreateJobRunDetails.

        :param queue: The queue of this CreateJobRunDetails.
        :type: oci.aidataplatform_dp.models.Queue
        """
        self._queue = queue

    @property
    def repair_history(self):
        """
        Gets the repair_history of this CreateJobRunDetails.
        Array of repaired runs.


        :return: The repair_history of this CreateJobRunDetails.
        :rtype: list[oci.aidataplatform_dp.models.RepairHistory]
        """
        return self._repair_history

    @repair_history.setter
    def repair_history(self, repair_history):
        """
        Sets the repair_history of this CreateJobRunDetails.
        Array of repaired runs.


        :param repair_history: The repair_history of this CreateJobRunDetails.
        :type: list[oci.aidataplatform_dp.models.RepairHistory]
        """
        self._repair_history = repair_history

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
