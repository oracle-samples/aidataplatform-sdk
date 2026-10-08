# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentTarget(object):
    """
    A model version targeted by a deployment and its traffic share.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentTarget object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_version:
            The value to assign to the model_version property of this DeploymentTarget.
        :type model_version: str

        :param traffic_percentage:
            The value to assign to the traffic_percentage property of this DeploymentTarget.
        :type traffic_percentage: int

        """
        self.swagger_types = {
            'model_version': 'str',
            'traffic_percentage': 'int'
        }

        self.attribute_map = {
            'model_version': 'model_version',
            'traffic_percentage': 'traffic_percentage'
        }

        self._model_version = None
        self._traffic_percentage = None

    @property
    def model_version(self):
        """
        **[Required]** Gets the model_version of this DeploymentTarget.
        Version number of the model version.


        :return: The model_version of this DeploymentTarget.
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this DeploymentTarget.
        Version number of the model version.


        :param model_version: The model_version of this DeploymentTarget.
        :type: str
        """
        self._model_version = model_version

    @property
    def traffic_percentage(self):
        """
        **[Required]** Gets the traffic_percentage of this DeploymentTarget.
        Percentage of deployment traffic routed to this model version.


        :return: The traffic_percentage of this DeploymentTarget.
        :rtype: int
        """
        return self._traffic_percentage

    @traffic_percentage.setter
    def traffic_percentage(self, traffic_percentage):
        """
        Sets the traffic_percentage of this DeploymentTarget.
        Percentage of deployment traffic routed to this model version.


        :param traffic_percentage: The traffic_percentage of this DeploymentTarget.
        :type: int
        """
        self._traffic_percentage = traffic_percentage

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
