# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateModelDeploymentDetails(object):
    """
    The data to create a model deployment.
    """

    #: A constant which can be used with the auth_type property of a CreateModelDeploymentDetails.
    #: This constant has a value of "AIDP"
    AUTH_TYPE_AIDP = "AIDP"

    #: A constant which can be used with the auth_type property of a CreateModelDeploymentDetails.
    #: This constant has a value of "OAUTH"
    AUTH_TYPE_OAUTH = "OAUTH"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateModelDeploymentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this CreateModelDeploymentDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this CreateModelDeploymentDetails.
        :type description: str

        :param model_name:
            The value to assign to the model_name property of this CreateModelDeploymentDetails.
        :type model_name: str

        :param deployment_targets:
            The value to assign to the deployment_targets property of this CreateModelDeploymentDetails.
        :type deployment_targets: list[oci.aidataplatform_dp.models.DeploymentTarget]

        :param workspace_key:
            The value to assign to the workspace_key property of this CreateModelDeploymentDetails.
        :type workspace_key: str

        :param compute_key:
            The value to assign to the compute_key property of this CreateModelDeploymentDetails.
        :type compute_key: str

        :param tags:
            The value to assign to the tags property of this CreateModelDeploymentDetails.
        :type tags: list[oci.aidataplatform_dp.models.ModelDeploymentTag]

        :param auth_type:
            The value to assign to the auth_type property of this CreateModelDeploymentDetails.
            Allowed values for this property are: "AIDP", "OAUTH"
        :type auth_type: str

        :param auth_details:
            The value to assign to the auth_details property of this CreateModelDeploymentDetails.
        :type auth_details: oci.aidataplatform_dp.models.DeploymentOAuthDetails

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'model_name': 'str',
            'deployment_targets': 'list[DeploymentTarget]',
            'workspace_key': 'str',
            'compute_key': 'str',
            'tags': 'list[ModelDeploymentTag]',
            'auth_type': 'str',
            'auth_details': 'DeploymentOAuthDetails'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'model_name': 'model_name',
            'deployment_targets': 'deployment_targets',
            'workspace_key': 'workspaceKey',
            'compute_key': 'computeKey',
            'tags': 'tags',
            'auth_type': 'authType',
            'auth_details': 'authDetails'
        }

        self._name = None
        self._description = None
        self._model_name = None
        self._deployment_targets = None
        self._workspace_key = None
        self._compute_key = None
        self._tags = None
        self._auth_type = None
        self._auth_details = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this CreateModelDeploymentDetails.
        Name of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :return: The name of this CreateModelDeploymentDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CreateModelDeploymentDetails.
        Name of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :param name: The name of this CreateModelDeploymentDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this CreateModelDeploymentDetails.
        Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.


        :return: The description of this CreateModelDeploymentDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateModelDeploymentDetails.
        Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.


        :param description: The description of this CreateModelDeploymentDetails.
        :type: str
        """
        self._description = description

    @property
    def model_name(self):
        """
        **[Required]** Gets the model_name of this CreateModelDeploymentDetails.
        Name of the registered model. At most 256 characters and 256 UTF-8 bytes.


        :return: The model_name of this CreateModelDeploymentDetails.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this CreateModelDeploymentDetails.
        Name of the registered model. At most 256 characters and 256 UTF-8 bytes.


        :param model_name: The model_name of this CreateModelDeploymentDetails.
        :type: str
        """
        self._model_name = model_name

    @property
    def deployment_targets(self):
        """
        **[Required]** Gets the deployment_targets of this CreateModelDeploymentDetails.
        Deployment targets of the deployment.


        :return: The deployment_targets of this CreateModelDeploymentDetails.
        :rtype: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        return self._deployment_targets

    @deployment_targets.setter
    def deployment_targets(self, deployment_targets):
        """
        Sets the deployment_targets of this CreateModelDeploymentDetails.
        Deployment targets of the deployment.


        :param deployment_targets: The deployment_targets of this CreateModelDeploymentDetails.
        :type: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        self._deployment_targets = deployment_targets

    @property
    def workspace_key(self):
        """
        **[Required]** Gets the workspace_key of this CreateModelDeploymentDetails.
        Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :return: The workspace_key of this CreateModelDeploymentDetails.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this CreateModelDeploymentDetails.
        Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :param workspace_key: The workspace_key of this CreateModelDeploymentDetails.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def compute_key(self):
        """
        **[Required]** Gets the compute_key of this CreateModelDeploymentDetails.
        Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :return: The compute_key of this CreateModelDeploymentDetails.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this CreateModelDeploymentDetails.
        Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :param compute_key: The compute_key of this CreateModelDeploymentDetails.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def tags(self):
        """
        Gets the tags of this CreateModelDeploymentDetails.
        List of tags set on the model deployment.


        :return: The tags of this CreateModelDeploymentDetails.
        :rtype: list[oci.aidataplatform_dp.models.ModelDeploymentTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this CreateModelDeploymentDetails.
        List of tags set on the model deployment.


        :param tags: The tags of this CreateModelDeploymentDetails.
        :type: list[oci.aidataplatform_dp.models.ModelDeploymentTag]
        """
        self._tags = tags

    @property
    def auth_type(self):
        """
        **[Required]** Gets the auth_type of this CreateModelDeploymentDetails.
        Authentication mechanism for the deployment's query endpoint. Required.

        Allowed values for this property are: "AIDP", "OAUTH"


        :return: The auth_type of this CreateModelDeploymentDetails.
        :rtype: str
        """
        return self._auth_type

    @auth_type.setter
    def auth_type(self, auth_type):
        """
        Sets the auth_type of this CreateModelDeploymentDetails.
        Authentication mechanism for the deployment's query endpoint. Required.


        :param auth_type: The auth_type of this CreateModelDeploymentDetails.
        :type: str
        """
        allowed_values = ["AIDP", "OAUTH"]
        if not value_allowed_none_or_none_sentinel(auth_type, allowed_values):
            raise ValueError(
                "Invalid value for `auth_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._auth_type = auth_type

    @property
    def auth_details(self):
        """
        Gets the auth_details of this CreateModelDeploymentDetails.

        :return: The auth_details of this CreateModelDeploymentDetails.
        :rtype: oci.aidataplatform_dp.models.DeploymentOAuthDetails
        """
        return self._auth_details

    @auth_details.setter
    def auth_details(self, auth_details):
        """
        Sets the auth_details of this CreateModelDeploymentDetails.

        :param auth_details: The auth_details of this CreateModelDeploymentDetails.
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
