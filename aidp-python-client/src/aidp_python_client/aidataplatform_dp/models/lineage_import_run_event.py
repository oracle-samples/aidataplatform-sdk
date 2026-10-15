# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LineageImportRunEvent(object):
    """
    High-level details of an imported OpenLineage run event.
    """

    #: A constant which can be used with the ingestion_lifecycle_state property of a LineageImportRunEvent.
    #: This constant has a value of "PENDING"
    INGESTION_LIFECYCLE_STATE_PENDING = "PENDING"

    #: A constant which can be used with the ingestion_lifecycle_state property of a LineageImportRunEvent.
    #: This constant has a value of "SUCCEEDED"
    INGESTION_LIFECYCLE_STATE_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the ingestion_lifecycle_state property of a LineageImportRunEvent.
    #: This constant has a value of "FAILED"
    INGESTION_LIFECYCLE_STATE_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new LineageImportRunEvent object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param event_type:
            The value to assign to the event_type property of this LineageImportRunEvent.
        :type event_type: str

        :param event_time:
            The value to assign to the event_time property of this LineageImportRunEvent.
        :type event_time: datetime

        :param key:
            The value to assign to the key property of this LineageImportRunEvent.
        :type key: str

        :param job_name:
            The value to assign to the job_name property of this LineageImportRunEvent.
        :type job_name: str

        :param ingestion_lifecycle_state:
            The value to assign to the ingestion_lifecycle_state property of this LineageImportRunEvent.
            Allowed values for this property are: "PENDING", "SUCCEEDED", "FAILED"
        :type ingestion_lifecycle_state: str

        :param inputs:
            The value to assign to the inputs property of this LineageImportRunEvent.
        :type inputs: list[oci.aidataplatform_dp.models.LineageImportRunEventDataset]

        :param outputs:
            The value to assign to the outputs property of this LineageImportRunEvent.
        :type outputs: list[oci.aidataplatform_dp.models.LineageImportRunEventDataset]

        """
        self.swagger_types = {
            'event_type': 'str',
            'event_time': 'datetime',
            'key': 'str',
            'job_name': 'str',
            'ingestion_lifecycle_state': 'str',
            'inputs': 'list[LineageImportRunEventDataset]',
            'outputs': 'list[LineageImportRunEventDataset]'
        }
        self.attribute_map = {
            'event_type': 'eventType',
            'event_time': 'eventTime',
            'key': 'key',
            'job_name': 'jobName',
            'ingestion_lifecycle_state': 'ingestionLifecycleState',
            'inputs': 'inputs',
            'outputs': 'outputs'
        }
        self._event_type = None
        self._event_time = None
        self._key = None
        self._job_name = None
        self._ingestion_lifecycle_state = None
        self._inputs = None
        self._outputs = None

    @property
    def event_type(self):
        """
        Gets the event_type of this LineageImportRunEvent.
        OpenLineage event type.


        :return: The event_type of this LineageImportRunEvent.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """
        Sets the event_type of this LineageImportRunEvent.
        OpenLineage event type.


        :param event_type: The event_type of this LineageImportRunEvent.
        :type: str
        """
        self._event_type = event_type

    @property
    def event_time(self):
        """
        Gets the event_time of this LineageImportRunEvent.
        Time the OpenLineage event occurred.


        :return: The event_time of this LineageImportRunEvent.
        :rtype: datetime
        """
        return self._event_time

    @event_time.setter
    def event_time(self, event_time):
        """
        Sets the event_time of this LineageImportRunEvent.
        Time the OpenLineage event occurred.


        :param event_time: The event_time of this LineageImportRunEvent.
        :type: datetime
        """
        self._event_time = event_time

    @property
    def key(self):
        """
        Gets the key of this LineageImportRunEvent.
        Unique identifier for the imported run event.


        :return: The key of this LineageImportRunEvent.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this LineageImportRunEvent.
        Unique identifier for the imported run event.


        :param key: The key of this LineageImportRunEvent.
        :type: str
        """
        self._key = key

    @property
    def job_name(self):
        """
        Gets the job_name of this LineageImportRunEvent.
        Name of the OpenLineage job.


        :return: The job_name of this LineageImportRunEvent.
        :rtype: str
        """
        return self._job_name

    @job_name.setter
    def job_name(self, job_name):
        """
        Sets the job_name of this LineageImportRunEvent.
        Name of the OpenLineage job.


        :param job_name: The job_name of this LineageImportRunEvent.
        :type: str
        """
        self._job_name = job_name

    @property
    def ingestion_lifecycle_state(self):
        """
        **[Required]** Gets the ingestion_lifecycle_state of this LineageImportRunEvent.
        Graph-ingestion state for this imported run event.

        Allowed values for this property are: "PENDING", "SUCCEEDED", "FAILED"


        :return: The ingestion_lifecycle_state of this LineageImportRunEvent.
        :rtype: str
        """
        return self._ingestion_lifecycle_state

    @ingestion_lifecycle_state.setter
    def ingestion_lifecycle_state(self, ingestion_lifecycle_state):
        """
        Sets the ingestion_lifecycle_state of this LineageImportRunEvent.
        Graph-ingestion state for this imported run event.


        :param ingestion_lifecycle_state: The ingestion_lifecycle_state of this LineageImportRunEvent.
        :type: str
        """
        allowed_values = ["PENDING", "SUCCEEDED", "FAILED"]
        if not value_allowed_none_or_none_sentinel(ingestion_lifecycle_state, allowed_values):
            raise ValueError(
                f"Invalid value for `ingestion_lifecycle_state`, must be None or one of {allowed_values}"
            )
        self._ingestion_lifecycle_state = ingestion_lifecycle_state

    @property
    def inputs(self):
        """
        Gets the inputs of this LineageImportRunEvent.
        Input datasets referenced by the run event.


        :return: The inputs of this LineageImportRunEvent.
        :rtype: list[oci.aidataplatform_dp.models.LineageImportRunEventDataset]
        """
        return self._inputs

    @inputs.setter
    def inputs(self, inputs):
        """
        Sets the inputs of this LineageImportRunEvent.
        Input datasets referenced by the run event.


        :param inputs: The inputs of this LineageImportRunEvent.
        :type: list[oci.aidataplatform_dp.models.LineageImportRunEventDataset]
        """
        self._inputs = inputs

    @property
    def outputs(self):
        """
        Gets the outputs of this LineageImportRunEvent.
        Output datasets referenced by the run event.


        :return: The outputs of this LineageImportRunEvent.
        :rtype: list[oci.aidataplatform_dp.models.LineageImportRunEventDataset]
        """
        return self._outputs

    @outputs.setter
    def outputs(self, outputs):
        """
        Sets the outputs of this LineageImportRunEvent.
        Output datasets referenced by the run event.


        :param outputs: The outputs of this LineageImportRunEvent.
        :type: list[oci.aidataplatform_dp.models.LineageImportRunEventDataset]
        """
        self._outputs = outputs

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
