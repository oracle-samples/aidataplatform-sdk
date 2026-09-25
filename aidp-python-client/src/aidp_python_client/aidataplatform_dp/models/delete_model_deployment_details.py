# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeleteModelDeploymentDetails(object):
    """
    The data to delete a model deployment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeleteModelDeploymentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this DeleteModelDeploymentDetails.
        :type deployment_id: str

        """
        self.swagger_types = {
            'deployment_id': 'str'
        }

        self.attribute_map = {
            'deployment_id': 'deployment_id'
        }

        self._deployment_id = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this DeleteModelDeploymentDetails.
        ID of the deployment to delete.


        :return: The deployment_id of this DeleteModelDeploymentDetails.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this DeleteModelDeploymentDetails.
        ID of the deployment to delete.


        :param deployment_id: The deployment_id of this DeleteModelDeploymentDetails.
        :type: str
        """
        self._deployment_id = deployment_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
