# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Model(object):
    """
    A Data Lake Model details
    """

    #: A constant which can be used with the model_type property of a Model.
    #: This constant has a value of "GEN_AI"
    MODEL_TYPE_GEN_AI = "GEN_AI"

    #: A constant which can be used with the lifecycle_state property of a Model.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a Model.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a Model.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a Model.
    #: This constant has a value of "DELETED"
    LIFECYCLE_STATE_DELETED = "DELETED"

    #: A constant which can be used with the lifecycle_state property of a Model.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new Model object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.AiModel`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_type:
            The value to assign to the model_type property of this Model.
            Allowed values for this property are: "GEN_AI"
        :type model_type: str

        :param id:
            The value to assign to the id property of this Model.
        :type id: str

        :param model_name:
            The value to assign to the model_name property of this Model.
        :type model_name: str

        :param display_name:
            The value to assign to the display_name property of this Model.
        :type display_name: str

        :param namespace_name:
            The value to assign to the namespace_name property of this Model.
        :type namespace_name: str

        :param description:
            The value to assign to the description property of this Model.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this Model.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Model.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this Model.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this Model.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Model.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED"
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this Model.
        :type lifecycle_details: str

        """
        self.swagger_types = {
            'model_type': 'str',
            'id': 'str',
            'model_name': 'str',
            'display_name': 'str',
            'namespace_name': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str',
            'lifecycle_details': 'str'
        }

        self.attribute_map = {
            'model_type': 'modelType',
            'id': 'id',
            'model_name': 'modelName',
            'display_name': 'displayName',
            'namespace_name': 'namespaceName',
            'description': 'description',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails'
        }

        self._model_type = None
        self._id = None
        self._model_name = None
        self._display_name = None
        self._namespace_name = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._lifecycle_details = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['modelType']

        if type == 'GEN_AI':
            return 'AiModel'
        else:
            return 'Model'

    @property
    def model_type(self):
        """
        Gets the model_type of this Model.
        Possible modelTypes of Models object

        Allowed values for this property are: "GEN_AI"


        :return: The model_type of this Model.
        :rtype: str
        """
        return self._model_type

    @model_type.setter
    def model_type(self, model_type):
        """
        Sets the model_type of this Model.
        Possible modelTypes of Models object


        :param model_type: The model_type of this Model.
        :type: str
        """
        allowed_values = ["GEN_AI"]
        if not value_allowed_none_or_none_sentinel(model_type, allowed_values):
            raise ValueError(
                "Invalid value for `model_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._model_type = model_type

    @property
    def id(self):
        """
        **[Required]** Gets the id of this Model.
        A unique Id for the model, that is immutable on creation.


        :return: The id of this Model.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this Model.
        A unique Id for the model, that is immutable on creation.


        :param id: The id of this Model.
        :type: str
        """
        self._id = id

    @property
    def model_name(self):
        """
        **[Required]** Gets the model_name of this Model.
        modelName that is immutable on creation.


        :return: The model_name of this Model.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this Model.
        modelName that is immutable on creation.


        :param model_name: The model_name of this Model.
        :type: str
        """
        self._model_name = model_name

    @property
    def display_name(self):
        """
        Gets the display_name of this Model.
        The model name. It can be changed.


        :return: The display_name of this Model.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Model.
        The model name. It can be changed.


        :param display_name: The display_name of this Model.
        :type: str
        """
        self._display_name = display_name

    @property
    def namespace_name(self):
        """
        Gets the namespace_name of this Model.
        The model's schema.


        :return: The namespace_name of this Model.
        :rtype: str
        """
        return self._namespace_name

    @namespace_name.setter
    def namespace_name(self, namespace_name):
        """
        Sets the namespace_name of this Model.
        The model's schema.


        :param namespace_name: The namespace_name of this Model.
        :type: str
        """
        self._namespace_name = namespace_name

    @property
    def description(self):
        """
        Gets the description of this Model.
        The description of the Model.


        :return: The description of this Model.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Model.
        The description of the Model.


        :param description: The description of this Model.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        Gets the time_created of this Model.
        The time the Model was created. An RFC3339 formatted datetime string.


        :return: The time_created of this Model.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Model.
        The time the Model was created. An RFC3339 formatted datetime string.


        :param time_created: The time_created of this Model.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Model.
        The time the Model was updated. An RFC3339 formatted datetime string.


        :return: The time_updated of this Model.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Model.
        The time the Model was updated. An RFC3339 formatted datetime string.


        :param time_updated: The time_updated of this Model.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this Model.
        The vendor who created the Model.


        :return: The created_by of this Model.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Model.
        The vendor who created the Model.


        :param created_by: The created_by of this Model.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Model.
        The vendor who updated the Model.


        :return: The updated_by of this Model.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Model.
        The vendor who updated the Model.


        :param updated_by: The updated_by of this Model.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this Model.
        The state of the Model.

        Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED"


        :return: The lifecycle_state of this Model.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Model.
        The state of the Model.


        :param lifecycle_state: The lifecycle_state of this Model.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this Model.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_details of this Model.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this Model.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_details: The lifecycle_details of this Model.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
