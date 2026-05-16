# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateKnowledgeBaseJobDetails(object):
    """
    Request body for creating a new job definition for a KnowledgeBase.
    """

    #: A constant which can be used with the type property of a CreateKnowledgeBaseJobDetails.
    #: This constant has a value of "SCHEDULED"
    TYPE_SCHEDULED = "SCHEDULED"

    #: A constant which can be used with the type property of a CreateKnowledgeBaseJobDetails.
    #: This constant has a value of "ON_DEMAND"
    TYPE_ON_DEMAND = "ON_DEMAND"

    #: A constant which can be used with the goal property of a CreateKnowledgeBaseJobDetails.
    #: This constant has a value of "ADD_REFRESH_SOURCE"
    GOAL_ADD_REFRESH_SOURCE = "ADD_REFRESH_SOURCE"

    #: A constant which can be used with the goal property of a CreateKnowledgeBaseJobDetails.
    #: This constant has a value of "DELETE_SOURCE"
    GOAL_DELETE_SOURCE = "DELETE_SOURCE"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateKnowledgeBaseJobDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateKnowledgeBaseJobDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateKnowledgeBaseJobDetails.
        :type description: str

        :param type:
            The value to assign to the type property of this CreateKnowledgeBaseJobDetails.
            Allowed values for this property are: "SCHEDULED", "ON_DEMAND"
        :type type: str

        :param goal:
            The value to assign to the goal property of this CreateKnowledgeBaseJobDetails.
            Allowed values for this property are: "ADD_REFRESH_SOURCE", "DELETE_SOURCE"
        :type goal: str

        :param sources:
            The value to assign to the sources property of this CreateKnowledgeBaseJobDetails.
        :type sources: str

        :param source_key:
            The value to assign to the source_key property of this CreateKnowledgeBaseJobDetails.
        :type source_key: str

        :param schedule:
            The value to assign to the schedule property of this CreateKnowledgeBaseJobDetails.
        :type schedule: str

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'type': 'str',
            'goal': 'str',
            'sources': 'str',
            'source_key': 'str',
            'schedule': 'str'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'type': 'type',
            'goal': 'goal',
            'sources': 'sources',
            'source_key': 'sourceKey',
            'schedule': 'schedule'
        }

        self._display_name = None
        self._description = None
        self._type = None
        self._goal = None
        self._sources = None
        self._source_key = None
        self._schedule = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateKnowledgeBaseJobDetails.
        Name of KnowledgeBase Job Definition


        :return: The display_name of this CreateKnowledgeBaseJobDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateKnowledgeBaseJobDetails.
        Name of KnowledgeBase Job Definition


        :param display_name: The display_name of this CreateKnowledgeBaseJobDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateKnowledgeBaseJobDetails.
        The description of KnowledgeBase Job


        :return: The description of this CreateKnowledgeBaseJobDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateKnowledgeBaseJobDetails.
        The description of KnowledgeBase Job


        :param description: The description of this CreateKnowledgeBaseJobDetails.
        :type: str
        """
        self._description = description

    @property
    def type(self):
        """
        **[Required]** Gets the type of this CreateKnowledgeBaseJobDetails.
        type of KB Job

        Allowed values for this property are: "SCHEDULED", "ON_DEMAND"


        :return: The type of this CreateKnowledgeBaseJobDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateKnowledgeBaseJobDetails.
        type of KB Job


        :param type: The type of this CreateKnowledgeBaseJobDetails.
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
        Gets the goal of this CreateKnowledgeBaseJobDetails.
        type of KB Job Goal, if missing it is considered that job aims to add/refresh the sources

        Allowed values for this property are: "ADD_REFRESH_SOURCE", "DELETE_SOURCE"


        :return: The goal of this CreateKnowledgeBaseJobDetails.
        :rtype: str
        """
        return self._goal

    @goal.setter
    def goal(self, goal):
        """
        Sets the goal of this CreateKnowledgeBaseJobDetails.
        type of KB Job Goal, if missing it is considered that job aims to add/refresh the sources


        :param goal: The goal of this CreateKnowledgeBaseJobDetails.
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
        Gets the sources of this CreateKnowledgeBaseJobDetails.
        Name of the source, \"*\" should be provided to create a DEFAULT JOB and sourceKey can be left null/empty for DEFAULT Job


        :return: The sources of this CreateKnowledgeBaseJobDetails.
        :rtype: str
        """
        return self._sources

    @sources.setter
    def sources(self, sources):
        """
        Sets the sources of this CreateKnowledgeBaseJobDetails.
        Name of the source, \"*\" should be provided to create a DEFAULT JOB and sourceKey can be left null/empty for DEFAULT Job


        :param sources: The sources of this CreateKnowledgeBaseJobDetails.
        :type: str
        """
        self._sources = sources

    @property
    def source_key(self):
        """
        Gets the source_key of this CreateKnowledgeBaseJobDetails.
        Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)


        :return: The source_key of this CreateKnowledgeBaseJobDetails.
        :rtype: str
        """
        return self._source_key

    @source_key.setter
    def source_key(self, source_key):
        """
        Sets the source_key of this CreateKnowledgeBaseJobDetails.
        Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)


        :param source_key: The source_key of this CreateKnowledgeBaseJobDetails.
        :type: str
        """
        self._source_key = source_key

    @property
    def schedule(self):
        """
        Gets the schedule of this CreateKnowledgeBaseJobDetails.
        If the job type is SCHEDULED, this field is used to provide schedule information in cron style. For example, \"0 0 * * *\" means 12:00 AM daily


        :return: The schedule of this CreateKnowledgeBaseJobDetails.
        :rtype: str
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """
        Sets the schedule of this CreateKnowledgeBaseJobDetails.
        If the job type is SCHEDULED, this field is used to provide schedule information in cron style. For example, \"0 0 * * *\" means 12:00 AM daily


        :param schedule: The schedule of this CreateKnowledgeBaseJobDetails.
        :type: str
        """
        self._schedule = schedule

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
