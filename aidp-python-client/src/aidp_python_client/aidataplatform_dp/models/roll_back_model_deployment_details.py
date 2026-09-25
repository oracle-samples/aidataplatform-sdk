# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RollBackModelDeploymentDetails(object):
    """
    The data to roll a model deployment back to a lower model version of the same registered model. Exactly one deployment target may be provided; its model_version must be lower than the version currently configured on the deployment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RollBackModelDeploymentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this RollBackModelDeploymentDetails.
        :type deployment_id: str

        :param message:
            The value to assign to the message property of this RollBackModelDeploymentDetails.
        :type message: str

        :param deployment_targets:
            The value to assign to the deployment_targets property of this RollBackModelDeploymentDetails.
        :type deployment_targets: list[oci.aidataplatform_dp.models.DeploymentTarget]

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'message': 'str',
            'deployment_targets': 'list[DeploymentTarget]'
        }

        self.attribute_map = {
            'deployment_id': 'deployment_id',
            'message': 'message',
            'deployment_targets': 'deployment_targets'
        }

        self._deployment_id = None
        self._message = None
        self._deployment_targets = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this RollBackModelDeploymentDetails.
        ID of the deployment to roll back.


        :return: The deployment_id of this RollBackModelDeploymentDetails.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this RollBackModelDeploymentDetails.
        ID of the deployment to roll back.


        :param deployment_id: The deployment_id of this RollBackModelDeploymentDetails.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def message(self):
        """
        Gets the message of this RollBackModelDeploymentDetails.
        Optional deployment roll-back message. At most 2000 characters and 2000 UTF-8 bytes.


        :return: The message of this RollBackModelDeploymentDetails.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this RollBackModelDeploymentDetails.
        Optional deployment roll-back message. At most 2000 characters and 2000 UTF-8 bytes.


        :param message: The message of this RollBackModelDeploymentDetails.
        :type: str
        """
        self._message = message

    @property
    def deployment_targets(self):
        """
        **[Required]** Gets the deployment_targets of this RollBackModelDeploymentDetails.
        The single target model version to roll back to (exactly one, at 100% traffic).


        :return: The deployment_targets of this RollBackModelDeploymentDetails.
        :rtype: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        return self._deployment_targets

    @deployment_targets.setter
    def deployment_targets(self, deployment_targets):
        """
        Sets the deployment_targets of this RollBackModelDeploymentDetails.
        The single target model version to roll back to (exactly one, at 100% traffic).


        :param deployment_targets: The deployment_targets of this RollBackModelDeploymentDetails.
        :type: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        self._deployment_targets = deployment_targets

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
