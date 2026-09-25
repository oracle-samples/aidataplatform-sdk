# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelDeployment(object):
    """
    A model deployment.
    """

    #: A constant which can be used with the status property of a ModelDeployment.
    #: This constant has a value of "INACTIVE"
    STATUS_INACTIVE = "INACTIVE"

    #: A constant which can be used with the status property of a ModelDeployment.
    #: This constant has a value of "ACTIVATING"
    STATUS_ACTIVATING = "ACTIVATING"

    #: A constant which can be used with the status property of a ModelDeployment.
    #: This constant has a value of "ACTIVE"
    STATUS_ACTIVE = "ACTIVE"

    #: A constant which can be used with the status property of a ModelDeployment.
    #: This constant has a value of "DEACTIVATING"
    STATUS_DEACTIVATING = "DEACTIVATING"

    #: A constant which can be used with the status property of a ModelDeployment.
    #: This constant has a value of "UPDATING"
    STATUS_UPDATING = "UPDATING"

    #: A constant which can be used with the auth_type property of a ModelDeployment.
    #: This constant has a value of "AIDP"
    AUTH_TYPE_AIDP = "AIDP"

    #: A constant which can be used with the auth_type property of a ModelDeployment.
    #: This constant has a value of "OAUTH"
    AUTH_TYPE_OAUTH = "OAUTH"

    def __init__(self, **kwargs):
        """
        Initializes a new ModelDeployment object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this ModelDeployment.
        :type deployment_id: str

        :param name:
            The value to assign to the name property of this ModelDeployment.
        :type name: str

        :param description:
            The value to assign to the description property of this ModelDeployment.
        :type description: str

        :param model_name:
            The value to assign to the model_name property of this ModelDeployment.
        :type model_name: str

        :param deployment_targets:
            The value to assign to the deployment_targets property of this ModelDeployment.
        :type deployment_targets: list[oci.aidataplatform_dp.models.DeploymentTarget]

        :param workspace_key:
            The value to assign to the workspace_key property of this ModelDeployment.
        :type workspace_key: str

        :param compute_key:
            The value to assign to the compute_key property of this ModelDeployment.
        :type compute_key: str

        :param status:
            The value to assign to the status property of this ModelDeployment.
            Allowed values for this property are: "INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param activated_time:
            The value to assign to the activated_time property of this ModelDeployment.
        :type activated_time: int

        :param activated_by:
            The value to assign to the activated_by property of this ModelDeployment.
        :type activated_by: str

        :param serving_uri:
            The value to assign to the serving_uri property of this ModelDeployment.
        :type serving_uri: str

        :param created_time:
            The value to assign to the created_time property of this ModelDeployment.
        :type created_time: str

        :param updated_time:
            The value to assign to the updated_time property of this ModelDeployment.
        :type updated_time: str

        :param created_by:
            The value to assign to the created_by property of this ModelDeployment.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this ModelDeployment.
        :type updated_by: str

        :param tags:
            The value to assign to the tags property of this ModelDeployment.
        :type tags: list[oci.aidataplatform_dp.models.ModelDeploymentTag]

        :param auth_type:
            The value to assign to the auth_type property of this ModelDeployment.
            Allowed values for this property are: "AIDP", "OAUTH", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type auth_type: str

        :param auth_details:
            The value to assign to the auth_details property of this ModelDeployment.
        :type auth_details: oci.aidataplatform_dp.models.DeploymentOAuthDetails

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'name': 'str',
            'description': 'str',
            'model_name': 'str',
            'deployment_targets': 'list[DeploymentTarget]',
            'workspace_key': 'str',
            'compute_key': 'str',
            'status': 'str',
            'activated_time': 'int',
            'activated_by': 'str',
            'serving_uri': 'str',
            'created_time': 'str',
            'updated_time': 'str',
            'created_by': 'str',
            'updated_by': 'str',
            'tags': 'list[ModelDeploymentTag]',
            'auth_type': 'str',
            'auth_details': 'DeploymentOAuthDetails'
        }

        self.attribute_map = {
            'deployment_id': 'deployment_id',
            'name': 'name',
            'description': 'description',
            'model_name': 'model_name',
            'deployment_targets': 'deployment_targets',
            'workspace_key': 'workspaceKey',
            'compute_key': 'computeKey',
            'status': 'status',
            'activated_time': 'activated_time',
            'activated_by': 'activated_by',
            'serving_uri': 'serving_uri',
            'created_time': 'created_time',
            'updated_time': 'updated_time',
            'created_by': 'created_by',
            'updated_by': 'updated_by',
            'tags': 'tags',
            'auth_type': 'authType',
            'auth_details': 'authDetails'
        }

        self._deployment_id = None
        self._name = None
        self._description = None
        self._model_name = None
        self._deployment_targets = None
        self._workspace_key = None
        self._compute_key = None
        self._status = None
        self._activated_time = None
        self._activated_by = None
        self._serving_uri = None
        self._created_time = None
        self._updated_time = None
        self._created_by = None
        self._updated_by = None
        self._tags = None
        self._auth_type = None
        self._auth_details = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this ModelDeployment.
        ID of the deployment.


        :return: The deployment_id of this ModelDeployment.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this ModelDeployment.
        ID of the deployment.


        :param deployment_id: The deployment_id of this ModelDeployment.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this ModelDeployment.
        Name of the deployment.


        :return: The name of this ModelDeployment.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ModelDeployment.
        Name of the deployment.


        :param name: The name of this ModelDeployment.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this ModelDeployment.
        Description of the deployment.


        :return: The description of this ModelDeployment.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ModelDeployment.
        Description of the deployment.


        :param description: The description of this ModelDeployment.
        :type: str
        """
        self._description = description

    @property
    def model_name(self):
        """
        **[Required]** Gets the model_name of this ModelDeployment.
        Name of the registered model.


        :return: The model_name of this ModelDeployment.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this ModelDeployment.
        Name of the registered model.


        :param model_name: The model_name of this ModelDeployment.
        :type: str
        """
        self._model_name = model_name

    @property
    def deployment_targets(self):
        """
        **[Required]** Gets the deployment_targets of this ModelDeployment.
        Deployment targets of the deployment.


        :return: The deployment_targets of this ModelDeployment.
        :rtype: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        return self._deployment_targets

    @deployment_targets.setter
    def deployment_targets(self, deployment_targets):
        """
        Sets the deployment_targets of this ModelDeployment.
        Deployment targets of the deployment.


        :param deployment_targets: The deployment_targets of this ModelDeployment.
        :type: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        self._deployment_targets = deployment_targets

    @property
    def workspace_key(self):
        """
        **[Required]** Gets the workspace_key of this ModelDeployment.
        Workspace key of the deployment.


        :return: The workspace_key of this ModelDeployment.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this ModelDeployment.
        Workspace key of the deployment.


        :param workspace_key: The workspace_key of this ModelDeployment.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def compute_key(self):
        """
        **[Required]** Gets the compute_key of this ModelDeployment.
        Compute key of the deployment.


        :return: The compute_key of this ModelDeployment.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this ModelDeployment.
        Compute key of the deployment.


        :param compute_key: The compute_key of this ModelDeployment.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def status(self):
        """
        **[Required]** Gets the status of this ModelDeployment.
        Status of the deployment.

        Allowed values for this property are: "INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this ModelDeployment.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this ModelDeployment.
        Status of the deployment.


        :param status: The status of this ModelDeployment.
        :type: str
        """
        allowed_values = ["INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def activated_time(self):
        """
        Gets the activated_time of this ModelDeployment.
        Unix timestamp in milliseconds of when the deployment was activated.


        :return: The activated_time of this ModelDeployment.
        :rtype: int
        """
        return self._activated_time

    @activated_time.setter
    def activated_time(self, activated_time):
        """
        Sets the activated_time of this ModelDeployment.
        Unix timestamp in milliseconds of when the deployment was activated.


        :param activated_time: The activated_time of this ModelDeployment.
        :type: int
        """
        self._activated_time = activated_time

    @property
    def activated_by(self):
        """
        Gets the activated_by of this ModelDeployment.
        User that activated the model deployment.


        :return: The activated_by of this ModelDeployment.
        :rtype: str
        """
        return self._activated_by

    @activated_by.setter
    def activated_by(self, activated_by):
        """
        Sets the activated_by of this ModelDeployment.
        User that activated the model deployment.


        :param activated_by: The activated_by of this ModelDeployment.
        :type: str
        """
        self._activated_by = activated_by

    @property
    def serving_uri(self):
        """
        Gets the serving_uri of this ModelDeployment.
        Serving URI of the deployment.


        :return: The serving_uri of this ModelDeployment.
        :rtype: str
        """
        return self._serving_uri

    @serving_uri.setter
    def serving_uri(self, serving_uri):
        """
        Sets the serving_uri of this ModelDeployment.
        Serving URI of the deployment.


        :param serving_uri: The serving_uri of this ModelDeployment.
        :type: str
        """
        self._serving_uri = serving_uri

    @property
    def created_time(self):
        """
        **[Required]** Gets the created_time of this ModelDeployment.
        Unix timestamp in milliseconds of when the deployment was created.


        :return: The created_time of this ModelDeployment.
        :rtype: str
        """
        return self._created_time

    @created_time.setter
    def created_time(self, created_time):
        """
        Sets the created_time of this ModelDeployment.
        Unix timestamp in milliseconds of when the deployment was created.


        :param created_time: The created_time of this ModelDeployment.
        :type: str
        """
        self._created_time = created_time

    @property
    def updated_time(self):
        """
        **[Required]** Gets the updated_time of this ModelDeployment.
        Unix timestamp in milliseconds of when the deployment was updated.


        :return: The updated_time of this ModelDeployment.
        :rtype: str
        """
        return self._updated_time

    @updated_time.setter
    def updated_time(self, updated_time):
        """
        Sets the updated_time of this ModelDeployment.
        Unix timestamp in milliseconds of when the deployment was updated.


        :param updated_time: The updated_time of this ModelDeployment.
        :type: str
        """
        self._updated_time = updated_time

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this ModelDeployment.
        User that created the model deployment.


        :return: The created_by of this ModelDeployment.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this ModelDeployment.
        User that created the model deployment.


        :param created_by: The created_by of this ModelDeployment.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        **[Required]** Gets the updated_by of this ModelDeployment.
        User that last updated the model deployment.


        :return: The updated_by of this ModelDeployment.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this ModelDeployment.
        User that last updated the model deployment.


        :param updated_by: The updated_by of this ModelDeployment.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def tags(self):
        """
        Gets the tags of this ModelDeployment.
        List of tags set on the model deployment.


        :return: The tags of this ModelDeployment.
        :rtype: list[oci.aidataplatform_dp.models.ModelDeploymentTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this ModelDeployment.
        List of tags set on the model deployment.


        :param tags: The tags of this ModelDeployment.
        :type: list[oci.aidataplatform_dp.models.ModelDeploymentTag]
        """
        self._tags = tags

    @property
    def auth_type(self):
        """
        Gets the auth_type of this ModelDeployment.
        Authentication mechanism selected for the deployment's query endpoint.

        Allowed values for this property are: "AIDP", "OAUTH", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The auth_type of this ModelDeployment.
        :rtype: str
        """
        return self._auth_type

    @auth_type.setter
    def auth_type(self, auth_type):
        """
        Sets the auth_type of this ModelDeployment.
        Authentication mechanism selected for the deployment's query endpoint.


        :param auth_type: The auth_type of this ModelDeployment.
        :type: str
        """
        allowed_values = ["AIDP", "OAUTH"]
        if not value_allowed_none_or_none_sentinel(auth_type, allowed_values):
            auth_type = 'UNKNOWN_ENUM_VALUE'
        self._auth_type = auth_type

    @property
    def auth_details(self):
        """
        Gets the auth_details of this ModelDeployment.

        :return: The auth_details of this ModelDeployment.
        :rtype: oci.aidataplatform_dp.models.DeploymentOAuthDetails
        """
        return self._auth_details

    @auth_details.setter
    def auth_details(self, auth_details):
        """
        Sets the auth_details of this ModelDeployment.

        :param auth_details: The auth_details of this ModelDeployment.
        :type: oci.aidataplatform_dp.models.DeploymentOAuthDetails
        """
        self._auth_details = auth_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
