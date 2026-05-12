# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .test_tool_details import TestToolDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TestRagToolDetails(TestToolDetails):
    """
    Request details when toolType = RAG.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TestRagToolDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.TestRagToolDetails.tool_type` attribute
        of this class is ``RAG`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_id:
            The value to assign to the agent_flow_id property of this TestRagToolDetails.
        :type agent_flow_id: str

        :param tool_type:
            The value to assign to the tool_type property of this TestRagToolDetails.
            Allowed values for this property are: "SQL", "PROMPT", "RAG", "MCP", "HTTP", "CUSTOM"
        :type tool_type: str

        :param config:
            The value to assign to the config property of this TestRagToolDetails.
        :type config: oci.aidataplatform_dp.models.RagToolConfiguration

        :param query:
            The value to assign to the query property of this TestRagToolDetails.
        :type query: str

        """
        self.swagger_types = {
            'agent_flow_id': 'str',
            'tool_type': 'str',
            'config': 'RagToolConfiguration',
            'query': 'str'
        }

        self.attribute_map = {
            'agent_flow_id': 'agentFlowId',
            'tool_type': 'toolType',
            'config': 'config',
            'query': 'query'
        }

        self._agent_flow_id = None
        self._tool_type = None
        self._config = None
        self._query = None
        self._tool_type = 'RAG'

    @property
    def config(self):
        """
        **[Required]** Gets the config of this TestRagToolDetails.

        :return: The config of this TestRagToolDetails.
        :rtype: oci.aidataplatform_dp.models.RagToolConfiguration
        """
        return self._config

    @config.setter
    def config(self, config):
        """
        Sets the config of this TestRagToolDetails.

        :param config: The config of this TestRagToolDetails.
        :type: oci.aidataplatform_dp.models.RagToolConfiguration
        """
        self._config = config

    @property
    def query(self):
        """
        **[Required]** Gets the query of this TestRagToolDetails.
        The user query or instruction to be augmented with retrieved context.


        :return: The query of this TestRagToolDetails.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this TestRagToolDetails.
        The user query or instruction to be augmented with retrieved context.


        :param query: The query of this TestRagToolDetails.
        :type: str
        """
        self._query = query

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
