# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KnowledgeBaseJob(object):
    """
    Description of KB Job Definition.
    """

    #: A constant which can be used with the type property of a KnowledgeBaseJob.
    #: This constant has a value of "SCHEDULED"
    TYPE_SCHEDULED = "SCHEDULED"

    #: A constant which can be used with the type property of a KnowledgeBaseJob.
    #: This constant has a value of "ON_DEMAND"
    TYPE_ON_DEMAND = "ON_DEMAND"

    #: A constant which can be used with the goal property of a KnowledgeBaseJob.
    #: This constant has a value of "ADD_REFRESH_SOURCE"
    GOAL_ADD_REFRESH_SOURCE = "ADD_REFRESH_SOURCE"

    #: A constant which can be used with the goal property of a KnowledgeBaseJob.
    #: This constant has a value of "DELETE_SOURCE"
    GOAL_DELETE_SOURCE = "DELETE_SOURCE"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJob.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJob.
    #: This constant has a value of "INACTIVE"
    LIFECYCLE_STATE_INACTIVE = "INACTIVE"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJob.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseJob.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    def __init__(self, **kwargs):
        """
        Initializes a new KnowledgeBaseJob object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this KnowledgeBaseJob.
        :type key: str

        :param workflow_job_key:
            The value to assign to the workflow_job_key property of this KnowledgeBaseJob.
        :type workflow_job_key: str

        :param display_name:
            The value to assign to the display_name property of this KnowledgeBaseJob.
        :type display_name: str

        :param description:
            The value to assign to the description property of this KnowledgeBaseJob.
        :type description: str

        :param knowledge_base_key:
            The value to assign to the knowledge_base_key property of this KnowledgeBaseJob.
        :type knowledge_base_key: str

        :param catalog_key:
            The value to assign to the catalog_key property of this KnowledgeBaseJob.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this KnowledgeBaseJob.
        :type schema_key: str

        :param type:
            The value to assign to the type property of this KnowledgeBaseJob.
            Allowed values for this property are: "SCHEDULED", "ON_DEMAND"
        :type type: str

        :param goal:
            The value to assign to the goal property of this KnowledgeBaseJob.
            Allowed values for this property are: "ADD_REFRESH_SOURCE", "DELETE_SOURCE"
        :type goal: str

        :param sources:
            The value to assign to the sources property of this KnowledgeBaseJob.
        :type sources: str

        :param source_key:
            The value to assign to the source_key property of this KnowledgeBaseJob.
        :type source_key: str

        :param schedule:
            The value to assign to the schedule property of this KnowledgeBaseJob.
        :type schedule: str

        :param time_created:
            The value to assign to the time_created property of this KnowledgeBaseJob.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this KnowledgeBaseJob.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this KnowledgeBaseJob.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this KnowledgeBaseJob.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this KnowledgeBaseJob.
            Allowed values for this property are: "ACTIVE", "INACTIVE", "CREATING", "DELETING"
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this KnowledgeBaseJob.
        :type lifecycle_state_details: str

        """
        self.swagger_types = {
            'key': 'str',
            'workflow_job_key': 'str',
            'display_name': 'str',
            'description': 'str',
            'knowledge_base_key': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'type': 'str',
            'goal': 'str',
            'sources': 'str',
            'source_key': 'str',
            'schedule': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'workflow_job_key': 'workflowJobKey',
            'display_name': 'displayName',
            'description': 'description',
            'knowledge_base_key': 'knowledgeBaseKey',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'type': 'type',
            'goal': 'goal',
            'sources': 'sources',
            'source_key': 'sourceKey',
            'schedule': 'schedule',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails'
        }

        self._key = None
        self._workflow_job_key = None
        self._display_name = None
        self._description = None
        self._knowledge_base_key = None
        self._catalog_key = None
        self._schema_key = None
        self._type = None
        self._goal = None
        self._sources = None
        self._source_key = None
        self._schedule = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this KnowledgeBaseJob.
        The Unique identifier for this KnowledgeBase Job resource


        :return: The key of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this KnowledgeBaseJob.
        The Unique identifier for this KnowledgeBase Job resource


        :param key: The key of this KnowledgeBaseJob.
        :type: str
        """
        self._key = key

    @property
    def workflow_job_key(self):
        """
        Gets the workflow_job_key of this KnowledgeBaseJob.
        The Unique identifier for this KnowledgeBase Job resource's mapped WF job


        :return: The workflow_job_key of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._workflow_job_key

    @workflow_job_key.setter
    def workflow_job_key(self, workflow_job_key):
        """
        Sets the workflow_job_key of this KnowledgeBaseJob.
        The Unique identifier for this KnowledgeBase Job resource's mapped WF job


        :param workflow_job_key: The workflow_job_key of this KnowledgeBaseJob.
        :type: str
        """
        self._workflow_job_key = workflow_job_key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this KnowledgeBaseJob.
        A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.


        :return: The display_name of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this KnowledgeBaseJob.
        A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.


        :param display_name: The display_name of this KnowledgeBaseJob.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this KnowledgeBaseJob.
        A user-friendly description about this KnowledgeBase Job resource


        :return: The description of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this KnowledgeBaseJob.
        A user-friendly description about this KnowledgeBase Job resource


        :param description: The description of this KnowledgeBaseJob.
        :type: str
        """
        self._description = description

    @property
    def knowledge_base_key(self):
        """
        **[Required]** Gets the knowledge_base_key of this KnowledgeBaseJob.
        The name of the KnowledgeBase


        :return: The knowledge_base_key of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._knowledge_base_key

    @knowledge_base_key.setter
    def knowledge_base_key(self, knowledge_base_key):
        """
        Sets the knowledge_base_key of this KnowledgeBaseJob.
        The name of the KnowledgeBase


        :param knowledge_base_key: The knowledge_base_key of this KnowledgeBaseJob.
        :type: str
        """
        self._knowledge_base_key = knowledge_base_key

    @property
    def catalog_key(self):
        """
        **[Required]** Gets the catalog_key of this KnowledgeBaseJob.
        The name of the catalog containing the KnowledgeBase.


        :return: The catalog_key of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this KnowledgeBaseJob.
        The name of the catalog containing the KnowledgeBase.


        :param catalog_key: The catalog_key of this KnowledgeBaseJob.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        **[Required]** Gets the schema_key of this KnowledgeBaseJob.
        The name of the schema containing the KnowledgeBase.


        :return: The schema_key of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this KnowledgeBaseJob.
        The name of the schema containing the KnowledgeBase.


        :param schema_key: The schema_key of this KnowledgeBaseJob.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def type(self):
        """
        **[Required]** Gets the type of this KnowledgeBaseJob.
        type of knowledgeBase Job Definition

        Allowed values for this property are: "SCHEDULED", "ON_DEMAND"


        :return: The type of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this KnowledgeBaseJob.
        type of knowledgeBase Job Definition


        :param type: The type of this KnowledgeBaseJob.
        :type: str
        """
        allowed_values = ["SCHEDULED", "ON_DEMAND"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def goal(self):
        """
        Gets the goal of this KnowledgeBaseJob.
        type of KB Job Goal

        Allowed values for this property are: "ADD_REFRESH_SOURCE", "DELETE_SOURCE"


        :return: The goal of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._goal

    @goal.setter
    def goal(self, goal):
        """
        Sets the goal of this KnowledgeBaseJob.
        type of KB Job Goal


        :param goal: The goal of this KnowledgeBaseJob.
        :type: str
        """
        allowed_values = ["ADD_REFRESH_SOURCE", "DELETE_SOURCE"]
        if not value_allowed_none_or_none_sentinel(goal, allowed_values):
            raise ValueError(
                "Invalid value for `goal`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._goal = goal

    @property
    def sources(self):
        """
        Gets the sources of this KnowledgeBaseJob.
        Name of the source, \"*\" for Default job


        :return: The sources of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._sources

    @sources.setter
    def sources(self, sources):
        """
        Sets the sources of this KnowledgeBaseJob.
        Name of the source, \"*\" for Default job


        :param sources: The sources of this KnowledgeBaseJob.
        :type: str
        """
        self._sources = sources

    @property
    def source_key(self):
        """
        Gets the source_key of this KnowledgeBaseJob.
        Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)


        :return: The source_key of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._source_key

    @source_key.setter
    def source_key(self, source_key):
        """
        Sets the source_key of this KnowledgeBaseJob.
        Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)


        :param source_key: The source_key of this KnowledgeBaseJob.
        :type: str
        """
        self._source_key = source_key

    @property
    def schedule(self):
        """
        Gets the schedule of this KnowledgeBaseJob.
        If the job type is SCHEDULED, this field is used to provide schedule information in cron style. For example, \"0 0 * * *\" means 12:00 AM daily


        :return: The schedule of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """
        Sets the schedule of this KnowledgeBaseJob.
        If the job type is SCHEDULED, this field is used to provide schedule information in cron style. For example, \"0 0 * * *\" means 12:00 AM daily


        :param schedule: The schedule of this KnowledgeBaseJob.
        :type: str
        """
        self._schedule = schedule

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this KnowledgeBaseJob.
        Timestamp when knowledgeBase job was created


        :return: The time_created of this KnowledgeBaseJob.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this KnowledgeBaseJob.
        Timestamp when knowledgeBase job was created


        :param time_created: The time_created of this KnowledgeBaseJob.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this KnowledgeBaseJob.
        Timestamp when knowledgeBase job was updated


        :return: The time_updated of this KnowledgeBaseJob.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this KnowledgeBaseJob.
        Timestamp when knowledgeBase job was updated


        :param time_updated: The time_updated of this KnowledgeBaseJob.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this KnowledgeBaseJob.
        Identifier for knowledgeBase job creator


        :return: The created_by of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this KnowledgeBaseJob.
        Identifier for knowledgeBase job creator


        :param created_by: The created_by of this KnowledgeBaseJob.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this KnowledgeBaseJob.
        Identifier for principal who updated the knowledgeBase job


        :return: The updated_by of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this KnowledgeBaseJob.
        Identifier for principal who updated the knowledgeBase job


        :param updated_by: The updated_by of this KnowledgeBaseJob.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this KnowledgeBaseJob.
        Lifecycle of knowledgeBase Job.

        Allowed values for this property are: "ACTIVE", "INACTIVE", "CREATING", "DELETING"


        :return: The lifecycle_state of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this KnowledgeBaseJob.
        Lifecycle of knowledgeBase Job.


        :param lifecycle_state: The lifecycle_state of this KnowledgeBaseJob.
        :type: str
        """
        allowed_values = ["ACTIVE", "INACTIVE", "CREATING", "DELETING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this KnowledgeBaseJob.
        Additional information about the current state of KB job


        :return: The lifecycle_state_details of this KnowledgeBaseJob.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this KnowledgeBaseJob.
        Additional information about the current state of KB job


        :param lifecycle_state_details: The lifecycle_state_details of this KnowledgeBaseJob.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
