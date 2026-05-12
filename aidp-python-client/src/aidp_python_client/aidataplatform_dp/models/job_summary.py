# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class JobSummary(object):
    """
    Summary information about a job.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new JobSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this JobSummary.
        :type key: str

        :param created_by:
            The value to assign to the created_by property of this JobSummary.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this JobSummary.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this JobSummary.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this JobSummary.
        :type updated_by_name: str

        :param name:
            The value to assign to the name property of this JobSummary.
        :type name: str

        :param path:
            The value to assign to the path property of this JobSummary.
        :type path: str

        :param schedule:
            The value to assign to the schedule property of this JobSummary.
        :type schedule: oci.aidataplatform_dp.models.Schedule

        :param run_as:
            The value to assign to the run_as property of this JobSummary.
        :type run_as: str

        :param time_created:
            The value to assign to the time_created property of this JobSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this JobSummary.
        :type time_updated: datetime

        :param clusters:
            The value to assign to the clusters property of this JobSummary.
        :type clusters: list[str]

        :param job_clusters:
            The value to assign to the job_clusters property of this JobSummary.
        :type job_clusters: list[oci.aidataplatform_dp.models.JobCluster]

        """
        self.swagger_types = {
            'key': 'str',
            'created_by': 'str',
            'created_by_name': 'str',
            'updated_by': 'str',
            'updated_by_name': 'str',
            'name': 'str',
            'path': 'str',
            'schedule': 'Schedule',
            'run_as': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'clusters': 'list[str]',
            'job_clusters': 'list[JobCluster]'
        }

        self.attribute_map = {
            'key': 'key',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'updated_by': 'updatedBy',
            'updated_by_name': 'updatedByName',
            'name': 'name',
            'path': 'path',
            'schedule': 'schedule',
            'run_as': 'runAs',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'clusters': 'clusters',
            'job_clusters': 'jobClusters'
        }

        self._key = None
        self._created_by = None
        self._created_by_name = None
        self._updated_by = None
        self._updated_by_name = None
        self._name = None
        self._path = None
        self._schedule = None
        self._run_as = None
        self._time_created = None
        self._time_updated = None
        self._clusters = None
        self._job_clusters = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this JobSummary.
        The OCID of the job.


        :return: The key of this JobSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this JobSummary.
        The OCID of the job.


        :param key: The key of this JobSummary.
        :type: str
        """
        self._key = key

    @property
    def created_by(self):
        """
        Gets the created_by of this JobSummary.
        The OCID of the IAM user.


        :return: The created_by of this JobSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this JobSummary.
        The OCID of the IAM user.


        :param created_by: The created_by of this JobSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this JobSummary.
        Name of the user who created this record


        :return: The created_by_name of this JobSummary.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this JobSummary.
        Name of the user who created this record


        :param created_by_name: The created_by_name of this JobSummary.
        :type: str
        """
        self._created_by_name = created_by_name

    @property
    def updated_by(self):
        """
        Gets the updated_by of this JobSummary.
        The OCID of the IAM user.


        :return: The updated_by of this JobSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this JobSummary.
        The OCID of the IAM user.


        :param updated_by: The updated_by of this JobSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def updated_by_name(self):
        """
        Gets the updated_by_name of this JobSummary.
        The username of the latest updater.


        :return: The updated_by_name of this JobSummary.
        :rtype: str
        """
        return self._updated_by_name

    @updated_by_name.setter
    def updated_by_name(self, updated_by_name):
        """
        Sets the updated_by_name of this JobSummary.
        The username of the latest updater.


        :param updated_by_name: The updated_by_name of this JobSummary.
        :type: str
        """
        self._updated_by_name = updated_by_name

    @property
    def name(self):
        """
        Gets the name of this JobSummary.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The name of this JobSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this JobSummary.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param name: The name of this JobSummary.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        Gets the path of this JobSummary.
        The path to store the job definition in.


        :return: The path of this JobSummary.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this JobSummary.
        The path to store the job definition in.


        :param path: The path of this JobSummary.
        :type: str
        """
        self._path = path

    @property
    def schedule(self):
        """
        Gets the schedule of this JobSummary.

        :return: The schedule of this JobSummary.
        :rtype: oci.aidataplatform_dp.models.Schedule
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """
        Sets the schedule of this JobSummary.

        :param schedule: The schedule of this JobSummary.
        :type: oci.aidataplatform_dp.models.Schedule
        """
        self._schedule = schedule

    @property
    def run_as(self):
        """
        Gets the run_as of this JobSummary.
        The id with which the job run as.


        :return: The run_as of this JobSummary.
        :rtype: str
        """
        return self._run_as

    @run_as.setter
    def run_as(self, run_as):
        """
        Sets the run_as of this JobSummary.
        The id with which the job run as.


        :param run_as: The run_as of this JobSummary.
        :type: str
        """
        self._run_as = run_as

    @property
    def time_created(self):
        """
        Gets the time_created of this JobSummary.
        The date and time the DataLake was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2025-05-25T21:10:29.600Z`


        :return: The time_created of this JobSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this JobSummary.
        The date and time the DataLake was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2025-05-25T21:10:29.600Z`


        :param time_created: The time_created of this JobSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this JobSummary.
        The date and time the DataLake was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2025-05-25T21:10:29.600Z`


        :return: The time_updated of this JobSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this JobSummary.
        The date and time the DataLake was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2025-05-25T21:10:29.600Z`


        :param time_updated: The time_updated of this JobSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def clusters(self):
        """
        Gets the clusters of this JobSummary.
        List of job cluster keys.


        :return: The clusters of this JobSummary.
        :rtype: list[str]
        """
        return self._clusters

    @clusters.setter
    def clusters(self, clusters):
        """
        Sets the clusters of this JobSummary.
        List of job cluster keys.


        :param clusters: The clusters of this JobSummary.
        :type: list[str]
        """
        self._clusters = clusters

    @property
    def job_clusters(self):
        """
        Gets the job_clusters of this JobSummary.
        List of job cluster configurations.


        :return: The job_clusters of this JobSummary.
        :rtype: list[oci.aidataplatform_dp.models.JobCluster]
        """
        return self._job_clusters

    @job_clusters.setter
    def job_clusters(self, job_clusters):
        """
        Sets the job_clusters of this JobSummary.
        List of job cluster configurations.


        :param job_clusters: The job_clusters of this JobSummary.
        :type: list[oci.aidataplatform_dp.models.JobCluster]
        """
        self._job_clusters = job_clusters

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
