# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DacEndpointSummary(object):
    """
    Summary information for an endpoint resource.
    """

    #: A constant which can be used with the lifecycle_state property of a DacEndpointSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a DacEndpointSummary.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a DacEndpointSummary.
    #: This constant has a value of "UPDATING"
    LIFECYCLE_STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the lifecycle_state property of a DacEndpointSummary.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a DacEndpointSummary.
    #: This constant has a value of "DELETED"
    LIFECYCLE_STATE_DELETED = "DELETED"

    #: A constant which can be used with the lifecycle_state property of a DacEndpointSummary.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new DacEndpointSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this DacEndpointSummary.
        :type id: str

        :param display_name:
            The value to assign to the display_name property of this DacEndpointSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this DacEndpointSummary.
        :type description: str

        :param model_id:
            The value to assign to the model_id property of this DacEndpointSummary.
        :type model_id: str

        :param compartment_id:
            The value to assign to the compartment_id property of this DacEndpointSummary.
        :type compartment_id: str

        :param dedicated_ai_cluster_id:
            The value to assign to the dedicated_ai_cluster_id property of this DacEndpointSummary.
        :type dedicated_ai_cluster_id: str

        :param time_created:
            The value to assign to the time_created property of this DacEndpointSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this DacEndpointSummary.
        :type time_updated: datetime

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this DacEndpointSummary.
            Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING", "DELETED", "FAILED"
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this DacEndpointSummary.
        :type lifecycle_details: str

        :param content_moderation_config:
            The value to assign to the content_moderation_config property of this DacEndpointSummary.
        :type content_moderation_config: oci.aidataplatform_dp.models.ContentModerationConfig

        :param system_tags:
            The value to assign to the system_tags property of this DacEndpointSummary.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'id': 'str',
            'display_name': 'str',
            'description': 'str',
            'model_id': 'str',
            'compartment_id': 'str',
            'dedicated_ai_cluster_id': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'lifecycle_state': 'str',
            'lifecycle_details': 'str',
            'content_moderation_config': 'ContentModerationConfig',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'id': 'id',
            'display_name': 'displayName',
            'description': 'description',
            'model_id': 'modelId',
            'compartment_id': 'compartmentId',
            'dedicated_ai_cluster_id': 'dedicatedAiClusterId',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails',
            'content_moderation_config': 'contentModerationConfig',
            'system_tags': 'systemTags'
        }

        self._id = None
        self._display_name = None
        self._description = None
        self._model_id = None
        self._compartment_id = None
        self._dedicated_ai_cluster_id = None
        self._time_created = None
        self._time_updated = None
        self._lifecycle_state = None
        self._lifecycle_details = None
        self._content_moderation_config = None
        self._system_tags = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this DacEndpointSummary.
        An OCID that uniquely identifies this endpoint resource.


        :return: The id of this DacEndpointSummary.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this DacEndpointSummary.
        An OCID that uniquely identifies this endpoint resource.


        :param id: The id of this DacEndpointSummary.
        :type: str
        """
        self._id = id

    @property
    def display_name(self):
        """
        Gets the display_name of this DacEndpointSummary.
        A user-friendly name. Does not have to be unique, and it's changeable.


        :return: The display_name of this DacEndpointSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this DacEndpointSummary.
        A user-friendly name. Does not have to be unique, and it's changeable.


        :param display_name: The display_name of this DacEndpointSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this DacEndpointSummary.
        An optional description of the endpoint.


        :return: The description of this DacEndpointSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this DacEndpointSummary.
        An optional description of the endpoint.


        :param description: The description of this DacEndpointSummary.
        :type: str
        """
        self._description = description

    @property
    def model_id(self):
        """
        **[Required]** Gets the model_id of this DacEndpointSummary.
        The OCID of the model that's used to create this endpoint.


        :return: The model_id of this DacEndpointSummary.
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """
        Sets the model_id of this DacEndpointSummary.
        The OCID of the model that's used to create this endpoint.


        :param model_id: The model_id of this DacEndpointSummary.
        :type: str
        """
        self._model_id = model_id

    @property
    def compartment_id(self):
        """
        **[Required]** Gets the compartment_id of this DacEndpointSummary.
        The compartment OCID to create the endpoint in.


        :return: The compartment_id of this DacEndpointSummary.
        :rtype: str
        """
        return self._compartment_id

    @compartment_id.setter
    def compartment_id(self, compartment_id):
        """
        Sets the compartment_id of this DacEndpointSummary.
        The compartment OCID to create the endpoint in.


        :param compartment_id: The compartment_id of this DacEndpointSummary.
        :type: str
        """
        self._compartment_id = compartment_id

    @property
    def dedicated_ai_cluster_id(self):
        """
        **[Required]** Gets the dedicated_ai_cluster_id of this DacEndpointSummary.
        The OCID of the dedicated AI cluster on which a model will be deployed to.


        :return: The dedicated_ai_cluster_id of this DacEndpointSummary.
        :rtype: str
        """
        return self._dedicated_ai_cluster_id

    @dedicated_ai_cluster_id.setter
    def dedicated_ai_cluster_id(self, dedicated_ai_cluster_id):
        """
        Sets the dedicated_ai_cluster_id of this DacEndpointSummary.
        The OCID of the dedicated AI cluster on which a model will be deployed to.


        :param dedicated_ai_cluster_id: The dedicated_ai_cluster_id of this DacEndpointSummary.
        :type: str
        """
        self._dedicated_ai_cluster_id = dedicated_ai_cluster_id

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this DacEndpointSummary.
        The date and time that the endpoint was created in the format of an RFC3339 datetime string.


        :return: The time_created of this DacEndpointSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this DacEndpointSummary.
        The date and time that the endpoint was created in the format of an RFC3339 datetime string.


        :param time_created: The time_created of this DacEndpointSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this DacEndpointSummary.
        The date and time the endpoint was updated in the format of n RFC3339 datetime string.


        :return: The time_updated of this DacEndpointSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this DacEndpointSummary.
        The date and time the endpoint was updated in the format of n RFC3339 datetime string.


        :param time_updated: The time_updated of this DacEndpointSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this DacEndpointSummary.
        The current state of the endpoint.
        Allowed values are:
        - ACTIVE
        - CREATING
        - UPDATING
        - DELETING
        - DELETED
        - FAILED

        Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING", "DELETED", "FAILED"


        :return: The lifecycle_state of this DacEndpointSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this DacEndpointSummary.
        The current state of the endpoint.
        Allowed values are:
        - ACTIVE
        - CREATING
        - UPDATING
        - DELETING
        - DELETED
        - FAILED


        :param lifecycle_state: The lifecycle_state of this DacEndpointSummary.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "UPDATING", "DELETING", "DELETED", "FAILED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this DacEndpointSummary.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_details of this DacEndpointSummary.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this DacEndpointSummary.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_details: The lifecycle_details of this DacEndpointSummary.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def content_moderation_config(self):
        """
        Gets the content_moderation_config of this DacEndpointSummary.

        :return: The content_moderation_config of this DacEndpointSummary.
        :rtype: oci.aidataplatform_dp.models.ContentModerationConfig
        """
        return self._content_moderation_config

    @content_moderation_config.setter
    def content_moderation_config(self, content_moderation_config):
        """
        Sets the content_moderation_config of this DacEndpointSummary.

        :param content_moderation_config: The content_moderation_config of this DacEndpointSummary.
        :type: oci.aidataplatform_dp.models.ContentModerationConfig
        """
        self._content_moderation_config = content_moderation_config

    @property
    def system_tags(self):
        """
        Gets the system_tags of this DacEndpointSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this DacEndpointSummary.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this DacEndpointSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this DacEndpointSummary.
        :type: dict(str, dict(str, object))
        """
        self._system_tags = system_tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
