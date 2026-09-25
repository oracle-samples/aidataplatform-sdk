# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeactivateModelDeploymentDetails(object):
    """
    The data to deactivate a model deployment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeactivateModelDeploymentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this DeactivateModelDeploymentDetails.
        :type deployment_id: str

        :param message:
            The value to assign to the message property of this DeactivateModelDeploymentDetails.
        :type message: str

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'message': 'str'
        }

        self.attribute_map = {
            'deployment_id': 'deployment_id',
            'message': 'message'
        }

        self._deployment_id = None
        self._message = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this DeactivateModelDeploymentDetails.
        ID of the deployment to deactivate.


        :return: The deployment_id of this DeactivateModelDeploymentDetails.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this DeactivateModelDeploymentDetails.
        ID of the deployment to deactivate.


        :param deployment_id: The deployment_id of this DeactivateModelDeploymentDetails.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def message(self):
        """
        Gets the message of this DeactivateModelDeploymentDetails.
        Optional deployment deactivation message. At most 2000 characters and 2000 UTF-8 bytes.


        :return: The message of this DeactivateModelDeploymentDetails.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this DeactivateModelDeploymentDetails.
        Optional deployment deactivation message. At most 2000 characters and 2000 UTF-8 bytes.


        :param message: The message of this DeactivateModelDeploymentDetails.
        :type: str
        """
        self._message = message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
