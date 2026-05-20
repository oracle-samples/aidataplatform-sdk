# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KnowledgeBaseJobRunSummary(object):
    """
    Description of KB Job Run.
    """

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJobRunSummary.
    #: This constant has a value of "ACCEPTED"
    LIFECYCLE_STATE_ACCEPTED = "ACCEPTED"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJobRunSummary.
    #: This constant has a value of "CANCELING"
    LIFECYCLE_STATE_CANCELING = "CANCELING"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJobRunSummary.
    #: This constant has a value of "CANCELED"
    LIFECYCLE_STATE_CANCELED = "CANCELED"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJobRunSummary.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJobRunSummary.
    #: This constant has a value of "SUCCEEDED"
    LIFECYCLE_STATE_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJobRunSummary.
    #: This constant has a value of "IN_PROGRESS"
    LIFECYCLE_STATE_IN_PROGRESS = "IN_PROGRESS"

    def __init__(self, **kwargs):
        """
        Initializes a new KnowledgeBaseJobRunSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this KnowledgeBaseJobRunSummary.
        :type key: str

        :param knowledge_base_job_key:
            The value to assign to the knowledge_base_job_key property of this KnowledgeBaseJobRunSummary.
        :type knowledge_base_job_key: str

        :param description:
            The value to assign to the description property of this KnowledgeBaseJobRunSummary.
        :type description: str

        :param catalog_key:
            The value to assign to the catalog_key property of this KnowledgeBaseJobRunSummary.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this KnowledgeBaseJobRunSummary.
        :type schema_key: str

        :param knowledge_base_key:
            The value to assign to the knowledge_base_key property of this KnowledgeBaseJobRunSummary.
        :type knowledge_base_key: str

        :param time_created:
            The value to assign to the time_created property of this KnowledgeBaseJobRunSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this KnowledgeBaseJobRunSummary.
        :type time_updated: datetime

        :param time_finished:
            The value to assign to the time_finished property of this KnowledgeBaseJobRunSummary.
        :type time_finished: datetime

        :param created_by:
            The value to assign to the created_by property of this KnowledgeBaseJobRunSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this KnowledgeBaseJobRunSummary.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this KnowledgeBaseJobRunSummary.
            Allowed values for this property are: "ACCEPTED", "CANCELING", "CANCELED", "FAILED", "SUCCEEDED", "IN_PROGRESS"
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this KnowledgeBaseJobRunSummary.
        :type lifecycle_state_details: str

        :param run_data:
            The value to assign to the run_data property of this KnowledgeBaseJobRunSummary.
        :type run_data: oci.aidataplatform_dp.models.KnowledgeBaseJobRunData

        """
        self.swagger_types = {
            'key': 'str',
            'knowledge_base_job_key': 'str',
            'description': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'knowledge_base_key': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'time_finished': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str',
            'run_data': 'KnowledgeBaseJobRunData'
        }

        self.attribute_map = {
            'key': 'key',
            'knowledge_base_job_key': 'knowledgeBaseJobKey',
            'description': 'description',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'knowledge_base_key': 'knowledgeBaseKey',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'time_finished': 'timeFinished',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails',
            'run_data': 'runData'
        }

        self._key = None
        self._knowledge_base_job_key = None
        self._description = None
        self._catalog_key = None
        self._schema_key = None
        self._knowledge_base_key = None
        self._time_created = None
        self._time_updated = None
        self._time_finished = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._run_data = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this KnowledgeBaseJobRunSummary.
        The Unique identifier for this KnowledgeBase Job run


        :return: The key of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this KnowledgeBaseJobRunSummary.
        The Unique identifier for this KnowledgeBase Job run


        :param key: The key of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._key = key

    @property
    def knowledge_base_job_key(self):
        """
        **[Required]** Gets the knowledge_base_job_key of this KnowledgeBaseJobRunSummary.
        The name of the KnowledgeBase Job definition


        :return: The knowledge_base_job_key of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._knowledge_base_job_key

    @knowledge_base_job_key.setter
    def knowledge_base_job_key(self, knowledge_base_job_key):
        """
        Sets the knowledge_base_job_key of this KnowledgeBaseJobRunSummary.
        The name of the KnowledgeBase Job definition


        :param knowledge_base_job_key: The knowledge_base_job_key of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._knowledge_base_job_key = knowledge_base_job_key

    @property
    def description(self):
        """
        Gets the description of this KnowledgeBaseJobRunSummary.
        A user-friendly description about this KnowledgeBase Job run


        :return: The description of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this KnowledgeBaseJobRunSummary.
        A user-friendly description about this KnowledgeBase Job run


        :param description: The description of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._description = description

    @property
    def catalog_key(self):
        """
        **[Required]** Gets the catalog_key of this KnowledgeBaseJobRunSummary.
        The name of the catalog containing the KnowledgeBase.


        :return: The catalog_key of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this KnowledgeBaseJobRunSummary.
        The name of the catalog containing the KnowledgeBase.


        :param catalog_key: The catalog_key of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        **[Required]** Gets the schema_key of this KnowledgeBaseJobRunSummary.
        The name of the schema containing the KnowledgeBase.


        :return: The schema_key of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this KnowledgeBaseJobRunSummary.
        The name of the schema containing the KnowledgeBase.


        :param schema_key: The schema_key of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def knowledge_base_key(self):
        """
        **[Required]** Gets the knowledge_base_key of this KnowledgeBaseJobRunSummary.
        The name of the KnowledgeBase


        :return: The knowledge_base_key of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._knowledge_base_key

    @knowledge_base_key.setter
    def knowledge_base_key(self, knowledge_base_key):
        """
        Sets the knowledge_base_key of this KnowledgeBaseJobRunSummary.
        The name of the KnowledgeBase


        :param knowledge_base_key: The knowledge_base_key of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._knowledge_base_key = knowledge_base_key

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this KnowledgeBaseJobRunSummary.
        Timestamp when KnowledgeBase job run was created


        :return: The time_created of this KnowledgeBaseJobRunSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this KnowledgeBaseJobRunSummary.
        Timestamp when KnowledgeBase job run was created


        :param time_created: The time_created of this KnowledgeBaseJobRunSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this KnowledgeBaseJobRunSummary.
        Timestamp when KnowledgeBase job run was updated


        :return: The time_updated of this KnowledgeBaseJobRunSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this KnowledgeBaseJobRunSummary.
        Timestamp when KnowledgeBase job run was updated


        :param time_updated: The time_updated of this KnowledgeBaseJobRunSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def time_finished(self):
        """
        Gets the time_finished of this KnowledgeBaseJobRunSummary.
        Timestamp when KnowledgeBase job run was updated


        :return: The time_finished of this KnowledgeBaseJobRunSummary.
        :rtype: datetime
        """
        return self._time_finished

    @time_finished.setter
    def time_finished(self, time_finished):
        """
        Sets the time_finished of this KnowledgeBaseJobRunSummary.
        Timestamp when KnowledgeBase job run was updated


        :param time_finished: The time_finished of this KnowledgeBaseJobRunSummary.
        :type: datetime
        """
        self._time_finished = time_finished

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this KnowledgeBaseJobRunSummary.
        Identifier for KnowledgeBase job run creator


        :return: The created_by of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this KnowledgeBaseJobRunSummary.
        Identifier for KnowledgeBase job run creator


        :param created_by: The created_by of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this KnowledgeBaseJobRunSummary.
        Identifier for principal who updated the KnowledgeBase


        :return: The updated_by of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this KnowledgeBaseJobRunSummary.
        Identifier for principal who updated the KnowledgeBase


        :param updated_by: The updated_by of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this KnowledgeBaseJobRunSummary.
        Lifecycle of KnowledgeBase Job Run.

        Allowed values for this property are: "ACCEPTED", "CANCELING", "CANCELED", "FAILED", "SUCCEEDED", "IN_PROGRESS"


        :return: The lifecycle_state of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this KnowledgeBaseJobRunSummary.
        Lifecycle of KnowledgeBase Job Run.


        :param lifecycle_state: The lifecycle_state of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        allowed_values = ["ACCEPTED", "CANCELING", "CANCELED", "FAILED", "SUCCEEDED", "IN_PROGRESS"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this KnowledgeBaseJobRunSummary.
        Additional information about the current state of KnowledgeBase job run


        :return: The lifecycle_state_details of this KnowledgeBaseJobRunSummary.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this KnowledgeBaseJobRunSummary.
        Additional information about the current state of KnowledgeBase job run


        :param lifecycle_state_details: The lifecycle_state_details of this KnowledgeBaseJobRunSummary.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    @property
    def run_data(self):
        """
        Gets the run_data of this KnowledgeBaseJobRunSummary.

        :return: The run_data of this KnowledgeBaseJobRunSummary.
        :rtype: oci.aidataplatform_dp.models.KnowledgeBaseJobRunData
        """
        return self._run_data

    @run_data.setter
    def run_data(self, run_data):
        """
        Sets the run_data of this KnowledgeBaseJobRunSummary.

        :param run_data: The run_data of this KnowledgeBaseJobRunSummary.
        :type: oci.aidataplatform_dp.models.KnowledgeBaseJobRunData
        """
        self._run_data = run_data

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
