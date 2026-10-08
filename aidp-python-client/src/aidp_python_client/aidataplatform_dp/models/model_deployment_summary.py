# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelDeploymentSummary(object):
    """
    Summary of a model deployment returned by a search.
    """

    #: A constant which can be used with the status property of a ModelDeploymentSummary.
    #: This constant has a value of "INACTIVE"
    STATUS_INACTIVE = "INACTIVE"

    #: A constant which can be used with the status property of a ModelDeploymentSummary.
    #: This constant has a value of "ACTIVATING"
    STATUS_ACTIVATING = "ACTIVATING"

    #: A constant which can be used with the status property of a ModelDeploymentSummary.
    #: This constant has a value of "ACTIVE"
    STATUS_ACTIVE = "ACTIVE"

    #: A constant which can be used with the status property of a ModelDeploymentSummary.
    #: This constant has a value of "DEACTIVATING"
    STATUS_DEACTIVATING = "DEACTIVATING"

    #: A constant which can be used with the status property of a ModelDeploymentSummary.
    #: This constant has a value of "UPDATING"
    STATUS_UPDATING = "UPDATING"

    def __init__(self, **kwargs):
        """
        Initializes a new ModelDeploymentSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this ModelDeploymentSummary.
        :type deployment_id: str

        :param name:
            The value to assign to the name property of this ModelDeploymentSummary.
        :type name: str

        :param description:
            The value to assign to the description property of this ModelDeploymentSummary.
        :type description: str

        :param model_name:
            The value to assign to the model_name property of this ModelDeploymentSummary.
        :type model_name: str

        :param status:
            The value to assign to the status property of this ModelDeploymentSummary.
            Allowed values for this property are: "INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param created_by:
            The value to assign to the created_by property of this ModelDeploymentSummary.
        :type created_by: str

        :param created_time:
            The value to assign to the created_time property of this ModelDeploymentSummary.
        :type created_time: str

        :param activated_time:
            The value to assign to the activated_time property of this ModelDeploymentSummary.
        :type activated_time: int

        :param activated_by:
            The value to assign to the activated_by property of this ModelDeploymentSummary.
        :type activated_by: str

        :param serving_uri:
            The value to assign to the serving_uri property of this ModelDeploymentSummary.
        :type serving_uri: str

        :param updated_time:
            The value to assign to the updated_time property of this ModelDeploymentSummary.
        :type updated_time: str

        :param updated_by:
            The value to assign to the updated_by property of this ModelDeploymentSummary.
        :type updated_by: str

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'name': 'str',
            'description': 'str',
            'model_name': 'str',
            'status': 'str',
            'created_by': 'str',
            'created_time': 'str',
            'activated_time': 'int',
            'activated_by': 'str',
            'serving_uri': 'str',
            'updated_time': 'str',
            'updated_by': 'str'
        }

        self.attribute_map = {
            'deployment_id': 'deployment_id',
            'name': 'name',
            'description': 'description',
            'model_name': 'model_name',
            'status': 'status',
            'created_by': 'created_by',
            'created_time': 'created_time',
            'activated_time': 'activated_time',
            'activated_by': 'activated_by',
            'serving_uri': 'serving_uri',
            'updated_time': 'updated_time',
            'updated_by': 'updated_by'
        }

        self._deployment_id = None
        self._name = None
        self._description = None
        self._model_name = None
        self._status = None
        self._created_by = None
        self._created_time = None
        self._activated_time = None
        self._activated_by = None
        self._serving_uri = None
        self._updated_time = None
        self._updated_by = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this ModelDeploymentSummary.
        ID of the deployment.


        :return: The deployment_id of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this ModelDeploymentSummary.
        ID of the deployment.


        :param deployment_id: The deployment_id of this ModelDeploymentSummary.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this ModelDeploymentSummary.
        Name of the deployment.


        :return: The name of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ModelDeploymentSummary.
        Name of the deployment.


        :param name: The name of this ModelDeploymentSummary.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this ModelDeploymentSummary.
        Description of the deployment.


        :return: The description of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ModelDeploymentSummary.
        Description of the deployment.


        :param description: The description of this ModelDeploymentSummary.
        :type: str
        """
        self._description = description

    @property
    def model_name(self):
        """
        **[Required]** Gets the model_name of this ModelDeploymentSummary.
        Name of the registered model.


        :return: The model_name of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this ModelDeploymentSummary.
        Name of the registered model.


        :param model_name: The model_name of this ModelDeploymentSummary.
        :type: str
        """
        self._model_name = model_name

    @property
    def status(self):
        """
        **[Required]** Gets the status of this ModelDeploymentSummary.
        Status of the deployment.

        Allowed values for this property are: "INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this ModelDeploymentSummary.
        Status of the deployment.


        :param status: The status of this ModelDeploymentSummary.
        :type: str
        """
        allowed_values = ["INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this ModelDeploymentSummary.
        User that created the model deployment.


        :return: The created_by of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this ModelDeploymentSummary.
        User that created the model deployment.


        :param created_by: The created_by of this ModelDeploymentSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_time(self):
        """
        **[Required]** Gets the created_time of this ModelDeploymentSummary.
        Unix timestamp in milliseconds of when the deployment was created.


        :return: The created_time of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._created_time

    @created_time.setter
    def created_time(self, created_time):
        """
        Sets the created_time of this ModelDeploymentSummary.
        Unix timestamp in milliseconds of when the deployment was created.


        :param created_time: The created_time of this ModelDeploymentSummary.
        :type: str
        """
        self._created_time = created_time

    @property
    def activated_time(self):
        """
        Gets the activated_time of this ModelDeploymentSummary.
        Unix timestamp in milliseconds of when the deployment was activated.


        :return: The activated_time of this ModelDeploymentSummary.
        :rtype: int
        """
        return self._activated_time

    @activated_time.setter
    def activated_time(self, activated_time):
        """
        Sets the activated_time of this ModelDeploymentSummary.
        Unix timestamp in milliseconds of when the deployment was activated.


        :param activated_time: The activated_time of this ModelDeploymentSummary.
        :type: int
        """
        self._activated_time = activated_time

    @property
    def activated_by(self):
        """
        Gets the activated_by of this ModelDeploymentSummary.
        User that activated the model deployment.


        :return: The activated_by of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._activated_by

    @activated_by.setter
    def activated_by(self, activated_by):
        """
        Sets the activated_by of this ModelDeploymentSummary.
        User that activated the model deployment.


        :param activated_by: The activated_by of this ModelDeploymentSummary.
        :type: str
        """
        self._activated_by = activated_by

    @property
    def serving_uri(self):
        """
        Gets the serving_uri of this ModelDeploymentSummary.
        Serving URI of the deployment.


        :return: The serving_uri of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._serving_uri

    @serving_uri.setter
    def serving_uri(self, serving_uri):
        """
        Sets the serving_uri of this ModelDeploymentSummary.
        Serving URI of the deployment.


        :param serving_uri: The serving_uri of this ModelDeploymentSummary.
        :type: str
        """
        self._serving_uri = serving_uri

    @property
    def updated_time(self):
        """
        **[Required]** Gets the updated_time of this ModelDeploymentSummary.
        Unix timestamp in milliseconds of when the deployment was updated.


        :return: The updated_time of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._updated_time

    @updated_time.setter
    def updated_time(self, updated_time):
        """
        Sets the updated_time of this ModelDeploymentSummary.
        Unix timestamp in milliseconds of when the deployment was updated.


        :param updated_time: The updated_time of this ModelDeploymentSummary.
        :type: str
        """
        self._updated_time = updated_time

    @property
    def updated_by(self):
        """
        **[Required]** Gets the updated_by of this ModelDeploymentSummary.
        User that last updated the model deployment.


        :return: The updated_by of this ModelDeploymentSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this ModelDeploymentSummary.
        User that last updated the model deployment.


        :param updated_by: The updated_by of this ModelDeploymentSummary.
        :type: str
        """
        self._updated_by = updated_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
