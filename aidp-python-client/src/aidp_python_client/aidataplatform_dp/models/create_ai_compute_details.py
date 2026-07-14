# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .create_cluster_details import CreateClusterDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateAiComputeDetails(CreateClusterDetails):
    """
    AI compute cluster details for creation.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateAiComputeDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.CreateAiComputeDetails.type` attribute
        of this class is ``AI_COMPUTE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this CreateAiComputeDetails.
            Allowed values for this property are: "USER", "AI_COMPUTE"
        :type type: str

        :param display_name:
            The value to assign to the display_name property of this CreateAiComputeDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateAiComputeDetails.
        :type description: str

        :param driver_config:
            The value to assign to the driver_config property of this CreateAiComputeDetails.
        :type driver_config: oci.aidataplatform_dp.models.DriverConfig

        :param node_type:
            The value to assign to the node_type property of this CreateAiComputeDetails.
        :type node_type: str

        :param replica_config:
            The value to assign to the replica_config property of this CreateAiComputeDetails.
        :type replica_config: oci.aidataplatform_dp.models.ReplicaConfig

        """
        self.swagger_types = {
            'type': 'str',
            'display_name': 'str',
            'description': 'str',
            'driver_config': 'DriverConfig',
            'node_type': 'str',
            'replica_config': 'ReplicaConfig'
        }

        self.attribute_map = {
            'type': 'type',
            'display_name': 'displayName',
            'description': 'description',
            'driver_config': 'driverConfig',
            'node_type': 'nodeType',
            'replica_config': 'replicaConfig'
        }

        self._type = None
        self._display_name = None
        self._description = None
        self._driver_config = None
        self._node_type = None
        self._replica_config = None
        self._type = 'AI_COMPUTE'

    @property
    def replica_config(self):
        """
        Gets the replica_config of this CreateAiComputeDetails.

        :return: The replica_config of this CreateAiComputeDetails.
        :rtype: oci.aidataplatform_dp.models.ReplicaConfig
        """
        return self._replica_config

    @replica_config.setter
    def replica_config(self, replica_config):
        """
        Sets the replica_config of this CreateAiComputeDetails.

        :param replica_config: The replica_config of this CreateAiComputeDetails.
        :type: oci.aidataplatform_dp.models.ReplicaConfig
        """
        self._replica_config = replica_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
