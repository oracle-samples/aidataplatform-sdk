# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .update_cluster_details import UpdateClusterDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentFlowComputeDetails(UpdateClusterDetails):
    """
    Agent Flow Compute cluster details for creation
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentFlowComputeDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.UpdateAgentFlowComputeDetails.type` attribute
        of this class is ``AGENT_FLOW_COMPUTE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this UpdateAgentFlowComputeDetails.
            Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE"
        :type type: str

        :param display_name:
            The value to assign to the display_name property of this UpdateAgentFlowComputeDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateAgentFlowComputeDetails.
        :type description: str

        :param driver_config:
            The value to assign to the driver_config property of this UpdateAgentFlowComputeDetails.
        :type driver_config: oci.aidataplatform_dp.models.DriverConfig

        :param node_type:
            The value to assign to the node_type property of this UpdateAgentFlowComputeDetails.
        :type node_type: str

        """
        self.swagger_types = {
            'type': 'str',
            'display_name': 'str',
            'description': 'str',
            'driver_config': 'DriverConfig',
            'node_type': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'display_name': 'displayName',
            'description': 'description',
            'driver_config': 'driverConfig',
            'node_type': 'nodeType'
        }

        self._type = None
        self._display_name = None
        self._description = None
        self._driver_config = None
        self._node_type = None
        self._type = 'AGENT_FLOW_COMPUTE'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
