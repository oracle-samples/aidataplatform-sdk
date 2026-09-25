# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateModelDeploymentDetails(object):
    """
    The data to update a model deployment. The registered model and model version cannot be changed here; use the roll-forward and roll-back actions instead.
    """

    #: A constant which can be used with the auth_type property of a UpdateModelDeploymentDetails.
    #: This constant has a value of "AIDP"
    AUTH_TYPE_AIDP = "AIDP"

    #: A constant which can be used with the auth_type property of a UpdateModelDeploymentDetails.
    #: This constant has a value of "OAUTH"
    AUTH_TYPE_OAUTH = "OAUTH"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateModelDeploymentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this UpdateModelDeploymentDetails.
        :type deployment_id: str

        :param name:
            The value to assign to the name property of this UpdateModelDeploymentDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this UpdateModelDeploymentDetails.
        :type description: str

        :param workspace_key:
            The value to assign to the workspace_key property of this UpdateModelDeploymentDetails.
        :type workspace_key: str

        :param compute_key:
            The value to assign to the compute_key property of this UpdateModelDeploymentDetails.
        :type compute_key: str

        :param deployment_targets:
            The value to assign to the deployment_targets property of this UpdateModelDeploymentDetails.
        :type deployment_targets: list[oci.aidataplatform_dp.models.DeploymentTarget]

        :param auth_type:
            The value to assign to the auth_type property of this UpdateModelDeploymentDetails.
            Allowed values for this property are: "AIDP", "OAUTH"
        :type auth_type: str

        :param auth_details:
            The value to assign to the auth_details property of this UpdateModelDeploymentDetails.
        :type auth_details: oci.aidataplatform_dp.models.DeploymentOAuthDetails

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'name': 'str',
            'description': 'str',
            'workspace_key': 'str',
            'compute_key': 'str',
            'deployment_targets': 'list[DeploymentTarget]',
            'auth_type': 'str',
            'auth_details': 'DeploymentOAuthDetails'
        }

        self.attribute_map = {
            'deployment_id': 'deployment_id',
            'name': 'name',
            'description': 'description',
            'workspace_key': 'workspaceKey',
            'compute_key': 'computeKey',
            'deployment_targets': 'deployment_targets',
            'auth_type': 'authType',
            'auth_details': 'authDetails'
        }

        self._deployment_id = None
        self._name = None
        self._description = None
        self._workspace_key = None
        self._compute_key = None
        self._deployment_targets = None
        self._auth_type = None
        self._auth_details = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this UpdateModelDeploymentDetails.
        ID of the deployment.


        :return: The deployment_id of this UpdateModelDeploymentDetails.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this UpdateModelDeploymentDetails.
        ID of the deployment.


        :param deployment_id: The deployment_id of this UpdateModelDeploymentDetails.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this UpdateModelDeploymentDetails.
        Name of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :return: The name of this UpdateModelDeploymentDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdateModelDeploymentDetails.
        Name of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :param name: The name of this UpdateModelDeploymentDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this UpdateModelDeploymentDetails.
        Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.


        :return: The description of this UpdateModelDeploymentDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateModelDeploymentDetails.
        Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.


        :param description: The description of this UpdateModelDeploymentDetails.
        :type: str
        """
        self._description = description

    @property
    def workspace_key(self):
        """
        **[Required]** Gets the workspace_key of this UpdateModelDeploymentDetails.
        Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :return: The workspace_key of this UpdateModelDeploymentDetails.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this UpdateModelDeploymentDetails.
        Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :param workspace_key: The workspace_key of this UpdateModelDeploymentDetails.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def compute_key(self):
        """
        **[Required]** Gets the compute_key of this UpdateModelDeploymentDetails.
        Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :return: The compute_key of this UpdateModelDeploymentDetails.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this UpdateModelDeploymentDetails.
        Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.


        :param compute_key: The compute_key of this UpdateModelDeploymentDetails.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def deployment_targets(self):
        """
        Gets the deployment_targets of this UpdateModelDeploymentDetails.
        Model versions served by the deployment. Immutable through update (use roll-forward/roll-back); accepted here only when unchanged.


        :return: The deployment_targets of this UpdateModelDeploymentDetails.
        :rtype: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        return self._deployment_targets

    @deployment_targets.setter
    def deployment_targets(self, deployment_targets):
        """
        Sets the deployment_targets of this UpdateModelDeploymentDetails.
        Model versions served by the deployment. Immutable through update (use roll-forward/roll-back); accepted here only when unchanged.


        :param deployment_targets: The deployment_targets of this UpdateModelDeploymentDetails.
        :type: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        self._deployment_targets = deployment_targets

    @property
    def auth_type(self):
        """
        Gets the auth_type of this UpdateModelDeploymentDetails.
        Authentication mechanism for the deployment's query endpoint. Required when authDetails is provided. Cannot be changed while the deployment is ACTIVE.

        Allowed values for this property are: "AIDP", "OAUTH"


        :return: The auth_type of this UpdateModelDeploymentDetails.
        :rtype: str
        """
        return self._auth_type

    @auth_type.setter
    def auth_type(self, auth_type):
        """
        Sets the auth_type of this UpdateModelDeploymentDetails.
        Authentication mechanism for the deployment's query endpoint. Required when authDetails is provided. Cannot be changed while the deployment is ACTIVE.


        :param auth_type: The auth_type of this UpdateModelDeploymentDetails.
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
        Gets the auth_details of this UpdateModelDeploymentDetails.

        :return: The auth_details of this UpdateModelDeploymentDetails.
        :rtype: oci.aidataplatform_dp.models.DeploymentOAuthDetails
        """
        return self._auth_details

    @auth_details.setter
    def auth_details(self, auth_details):
        """
        Sets the auth_details of this UpdateModelDeploymentDetails.

        :param auth_details: The auth_details of this UpdateModelDeploymentDetails.
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
