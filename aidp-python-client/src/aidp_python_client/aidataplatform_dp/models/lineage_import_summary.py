# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LineageImportSummary(object):
    """
    Summary of a lineage import.
    """

    #: A constant which can be used with the lifecycle_state property of a LineageImportSummary.
    #: This constant has a value of "ACCEPTED"
    LIFECYCLE_STATE_ACCEPTED = "ACCEPTED"

    #: A constant which can be used with the lifecycle_state property of a LineageImportSummary.
    #: This constant has a value of "IN_PROGRESS"
    LIFECYCLE_STATE_IN_PROGRESS = "IN_PROGRESS"

    #: A constant which can be used with the lifecycle_state property of a LineageImportSummary.
    #: This constant has a value of "SUCCEEDED"
    LIFECYCLE_STATE_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the lifecycle_state property of a LineageImportSummary.
    #: This constant has a value of "COMPLETED_WITH_ERROR"
    LIFECYCLE_STATE_COMPLETED_WITH_ERROR = "COMPLETED_WITH_ERROR"

    #: A constant which can be used with the lifecycle_state property of a LineageImportSummary.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    #: A constant which can be used with the lifecycle_state property of a LineageImportSummary.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    def __init__(self, **kwargs):
        """
        Initializes a new LineageImportSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this LineageImportSummary.
        :type key: str

        :param producer_name:
            The value to assign to the producer_name property of this LineageImportSummary.
        :type producer_name: str

        :param producer_uri:
            The value to assign to the producer_uri property of this LineageImportSummary.
        :type producer_uri: str

        :param job_namespace:
            The value to assign to the job_namespace property of this LineageImportSummary.
        :type job_namespace: str

        :param time_created:
            The value to assign to the time_created property of this LineageImportSummary.
        :type time_created: datetime

        :param time_finished:
            The value to assign to the time_finished property of this LineageImportSummary.
        :type time_finished: datetime

        :param created_by:
            The value to assign to the created_by property of this LineageImportSummary.
        :type created_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this LineageImportSummary.
            Allowed values for this property are: "ACCEPTED", "IN_PROGRESS", "SUCCEEDED", "COMPLETED_WITH_ERROR", "FAILED", "DELETING"
        :type lifecycle_state: str

        """
        self.swagger_types = {
            'key': 'str',
            'producer_name': 'str',
            'producer_uri': 'str',
            'job_namespace': 'str',
            'time_created': 'datetime',
            'time_finished': 'datetime',
            'created_by': 'str',
            'lifecycle_state': 'str'
        }
        self.attribute_map = {
            'key': 'key',
            'producer_name': 'producerName',
            'producer_uri': 'producerUri',
            'job_namespace': 'jobNamespace',
            'time_created': 'timeCreated',
            'time_finished': 'timeFinished',
            'created_by': 'createdBy',
            'lifecycle_state': 'lifecycleState'
        }
        self._key = None
        self._producer_name = None
        self._producer_uri = None
        self._job_namespace = None
        self._time_created = None
        self._time_finished = None
        self._created_by = None
        self._lifecycle_state = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this LineageImportSummary.
        Generated lineage import key.


        :return: The key of this LineageImportSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this LineageImportSummary.
        Generated lineage import key.


        :param key: The key of this LineageImportSummary.
        :type: str
        """
        self._key = key

    @property
    def producer_name(self):
        """
        **[Required]** Gets the producer_name of this LineageImportSummary.
        Name of the producer that emitted the lineage event.


        :return: The producer_name of this LineageImportSummary.
        :rtype: str
        """
        return self._producer_name

    @producer_name.setter
    def producer_name(self, producer_name):
        """
        Sets the producer_name of this LineageImportSummary.
        Name of the producer that emitted the lineage event.


        :param producer_name: The producer_name of this LineageImportSummary.
        :type: str
        """
        self._producer_name = producer_name

    @property
    def producer_uri(self):
        """
        Gets the producer_uri of this LineageImportSummary.
        URI of the lineage producer.


        :return: The producer_uri of this LineageImportSummary.
        :rtype: str
        """
        return self._producer_uri

    @producer_uri.setter
    def producer_uri(self, producer_uri):
        """
        Sets the producer_uri of this LineageImportSummary.
        URI of the lineage producer.


        :param producer_uri: The producer_uri of this LineageImportSummary.
        :type: str
        """
        self._producer_uri = producer_uri

    @property
    def job_namespace(self):
        """
        Gets the job_namespace of this LineageImportSummary.
        Namespace of the OpenLineage job.


        :return: The job_namespace of this LineageImportSummary.
        :rtype: str
        """
        return self._job_namespace

    @job_namespace.setter
    def job_namespace(self, job_namespace):
        """
        Sets the job_namespace of this LineageImportSummary.
        Namespace of the OpenLineage job.


        :param job_namespace: The job_namespace of this LineageImportSummary.
        :type: str
        """
        self._job_namespace = job_namespace

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this LineageImportSummary.
        Time the import was accepted.


        :return: The time_created of this LineageImportSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this LineageImportSummary.
        Time the import was accepted.


        :param time_created: The time_created of this LineageImportSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_finished(self):
        """
        Gets the time_finished of this LineageImportSummary.
        Time import processing completed.


        :return: The time_finished of this LineageImportSummary.
        :rtype: datetime
        """
        return self._time_finished

    @time_finished.setter
    def time_finished(self, time_finished):
        """
        Sets the time_finished of this LineageImportSummary.
        Time import processing completed.


        :param time_finished: The time_finished of this LineageImportSummary.
        :type: datetime
        """
        self._time_finished = time_finished

    @property
    def created_by(self):
        """
        Gets the created_by of this LineageImportSummary.
        Principal that submitted the import.


        :return: The created_by of this LineageImportSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this LineageImportSummary.
        Principal that submitted the import.


        :param created_by: The created_by of this LineageImportSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this LineageImportSummary.
        Current processing state of the lineage import.

        Allowed values for this property are: "ACCEPTED", "IN_PROGRESS", "SUCCEEDED", "COMPLETED_WITH_ERROR", "FAILED", "DELETING"


        :return: The lifecycle_state of this LineageImportSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this LineageImportSummary.
        Current processing state of the lineage import.


        :param lifecycle_state: The lifecycle_state of this LineageImportSummary.
        :type: str
        """
        allowed_values = ["ACCEPTED", "IN_PROGRESS", "SUCCEEDED", "COMPLETED_WITH_ERROR", "FAILED", "DELETING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                f"Invalid value for `lifecycle_state`, must be None or one of {allowed_values}"
            )
        self._lifecycle_state = lifecycle_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
