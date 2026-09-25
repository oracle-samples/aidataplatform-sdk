# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RegisteredModelSummary(object):
    """
    Aggregate counts of the registered-model footprint within a catalog and schema.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RegisteredModelSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param registered_models_count:
            The value to assign to the registered_models_count property of this RegisteredModelSummary.
        :type registered_models_count: int

        :param model_versions_count:
            The value to assign to the model_versions_count property of this RegisteredModelSummary.
        :type model_versions_count: int

        :param model_deployments_count:
            The value to assign to the model_deployments_count property of this RegisteredModelSummary.
        :type model_deployments_count: int

        :param active_deployment_count:
            The value to assign to the active_deployment_count property of this RegisteredModelSummary.
        :type active_deployment_count: int

        """
        self.swagger_types = {
            'registered_models_count': 'int',
            'model_versions_count': 'int',
            'model_deployments_count': 'int',
            'active_deployment_count': 'int'
        }

        self.attribute_map = {
            'registered_models_count': 'registered_models_count',
            'model_versions_count': 'model_versions_count',
            'model_deployments_count': 'model_deployments_count',
            'active_deployment_count': 'active_deployment_count'
        }

        self._registered_models_count = None
        self._model_versions_count = None
        self._model_deployments_count = None
        self._active_deployment_count = None

    @property
    def registered_models_count(self):
        """
        **[Required]** Gets the registered_models_count of this RegisteredModelSummary.
        Number of registered models in the catalog and schema.


        :return: The registered_models_count of this RegisteredModelSummary.
        :rtype: int
        """
        return self._registered_models_count

    @registered_models_count.setter
    def registered_models_count(self, registered_models_count):
        """
        Sets the registered_models_count of this RegisteredModelSummary.
        Number of registered models in the catalog and schema.


        :param registered_models_count: The registered_models_count of this RegisteredModelSummary.
        :type: int
        """
        self._registered_models_count = registered_models_count

    @property
    def model_versions_count(self):
        """
        **[Required]** Gets the model_versions_count of this RegisteredModelSummary.
        Number of model versions across those registered models.


        :return: The model_versions_count of this RegisteredModelSummary.
        :rtype: int
        """
        return self._model_versions_count

    @model_versions_count.setter
    def model_versions_count(self, model_versions_count):
        """
        Sets the model_versions_count of this RegisteredModelSummary.
        Number of model versions across those registered models.


        :param model_versions_count: The model_versions_count of this RegisteredModelSummary.
        :type: int
        """
        self._model_versions_count = model_versions_count

    @property
    def model_deployments_count(self):
        """
        **[Required]** Gets the model_deployments_count of this RegisteredModelSummary.
        Number of model deployments across those registered models.


        :return: The model_deployments_count of this RegisteredModelSummary.
        :rtype: int
        """
        return self._model_deployments_count

    @model_deployments_count.setter
    def model_deployments_count(self, model_deployments_count):
        """
        Sets the model_deployments_count of this RegisteredModelSummary.
        Number of model deployments across those registered models.


        :param model_deployments_count: The model_deployments_count of this RegisteredModelSummary.
        :type: int
        """
        self._model_deployments_count = model_deployments_count

    @property
    def active_deployment_count(self):
        """
        **[Required]** Gets the active_deployment_count of this RegisteredModelSummary.
        Number of model deployments that are currently active.


        :return: The active_deployment_count of this RegisteredModelSummary.
        :rtype: int
        """
        return self._active_deployment_count

    @active_deployment_count.setter
    def active_deployment_count(self, active_deployment_count):
        """
        Sets the active_deployment_count of this RegisteredModelSummary.
        Number of model deployments that are currently active.


        :param active_deployment_count: The active_deployment_count of this RegisteredModelSummary.
        :type: int
        """
        self._active_deployment_count = active_deployment_count

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
