# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentSummary(object):
    """
    Deployment counts for a registered model. Returned by a registered-model search only when the search requests the deployment summary, and omitted when it cannot be resolved. Both counts are always present together, so a summary reporting 0 means the model genuinely has no deployments, while no summary at all means the counts were not requested or could not be resolved.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param total_deployment:
            The value to assign to the total_deployment property of this DeploymentSummary.
        :type total_deployment: int

        :param active_deployment:
            The value to assign to the active_deployment property of this DeploymentSummary.
        :type active_deployment: int

        """
        self.swagger_types = {
            'total_deployment': 'int',
            'active_deployment': 'int'
        }

        self.attribute_map = {
            'total_deployment': 'total_deployment',
            'active_deployment': 'active_deployment'
        }

        self._total_deployment = None
        self._active_deployment = None

    @property
    def total_deployment(self):
        """
        **[Required]** Gets the total_deployment of this DeploymentSummary.
        Number of model deployments for this registered model, in any status.


        :return: The total_deployment of this DeploymentSummary.
        :rtype: int
        """
        return self._total_deployment

    @total_deployment.setter
    def total_deployment(self, total_deployment):
        """
        Sets the total_deployment of this DeploymentSummary.
        Number of model deployments for this registered model, in any status.


        :param total_deployment: The total_deployment of this DeploymentSummary.
        :type: int
        """
        self._total_deployment = total_deployment

    @property
    def active_deployment(self):
        """
        **[Required]** Gets the active_deployment of this DeploymentSummary.
        Number of those deployments that are currently active.


        :return: The active_deployment of this DeploymentSummary.
        :rtype: int
        """
        return self._active_deployment

    @active_deployment.setter
    def active_deployment(self, active_deployment):
        """
        Sets the active_deployment of this DeploymentSummary.
        Number of those deployments that are currently active.


        :param active_deployment: The active_deployment of this DeploymentSummary.
        :type: int
        """
        self._active_deployment = active_deployment

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
