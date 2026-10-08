# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentDetailsSummary(object):
    """
    Minimal deployment configuration for a deployment-activity list row: the registered model and the served model versions. The full configuration snapshot is available from the single-activity read.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentDetailsSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_name:
            The value to assign to the model_name property of this DeploymentDetailsSummary.
        :type model_name: str

        :param deployment_targets:
            The value to assign to the deployment_targets property of this DeploymentDetailsSummary.
        :type deployment_targets: list[oci.aidataplatform_dp.models.DeploymentTarget]

        """
        self.swagger_types = {
            'model_name': 'str',
            'deployment_targets': 'list[DeploymentTarget]'
        }

        self.attribute_map = {
            'model_name': 'model_name',
            'deployment_targets': 'deployment_targets'
        }

        self._model_name = None
        self._deployment_targets = None

    @property
    def model_name(self):
        """
        Gets the model_name of this DeploymentDetailsSummary.
        Name of the registered model.


        :return: The model_name of this DeploymentDetailsSummary.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this DeploymentDetailsSummary.
        Name of the registered model.


        :param model_name: The model_name of this DeploymentDetailsSummary.
        :type: str
        """
        self._model_name = model_name

    @property
    def deployment_targets(self):
        """
        Gets the deployment_targets of this DeploymentDetailsSummary.
        Model versions served by the deployment and their traffic share.


        :return: The deployment_targets of this DeploymentDetailsSummary.
        :rtype: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        return self._deployment_targets

    @deployment_targets.setter
    def deployment_targets(self, deployment_targets):
        """
        Sets the deployment_targets of this DeploymentDetailsSummary.
        Model versions served by the deployment and their traffic share.


        :param deployment_targets: The deployment_targets of this DeploymentDetailsSummary.
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
