# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateAgentFlowDetails(object):
    """
    The data to create a Agent flow.
    """

    #: A constant which can be used with the type property of a CreateAgentFlowDetails.
    #: This constant has a value of "CANVAS"
    TYPE_CANVAS = "CANVAS"

    #: A constant which can be used with the type property of a CreateAgentFlowDetails.
    #: This constant has a value of "CODE"
    TYPE_CODE = "CODE"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateAgentFlowDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateAgentFlowDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateAgentFlowDetails.
        :type description: str

        :param path_info:
            The value to assign to the path_info property of this CreateAgentFlowDetails.
        :type path_info: str

        :param type:
            The value to assign to the type property of this CreateAgentFlowDetails.
            Allowed values for this property are: "CANVAS", "CODE"
        :type type: str

        :param entry_file_path:
            The value to assign to the entry_file_path property of this CreateAgentFlowDetails.
        :type entry_file_path: str

        :param dependencies_file_path:
            The value to assign to the dependencies_file_path property of this CreateAgentFlowDetails.
        :type dependencies_file_path: str

        :param compute_key:
            The value to assign to the compute_key property of this CreateAgentFlowDetails.
        :type compute_key: str

        :param guardrails:
            The value to assign to the guardrails property of this CreateAgentFlowDetails.
        :type guardrails: oci.aidataplatform_dp.models.GuardrailsConfiguration

        :param session_config:
            The value to assign to the session_config property of this CreateAgentFlowDetails.
        :type session_config: oci.aidataplatform_dp.models.SessionConfiguration

        :param diagram:
            The value to assign to the diagram property of this CreateAgentFlowDetails.
        :type diagram: oci.aidataplatform_dp.models.AgentFlowDiagram

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'path_info': 'str',
            'type': 'str',
            'entry_file_path': 'str',
            'dependencies_file_path': 'str',
            'compute_key': 'str',
            'guardrails': 'GuardrailsConfiguration',
            'session_config': 'SessionConfiguration',
            'diagram': 'AgentFlowDiagram'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'path_info': 'pathInfo',
            'type': 'type',
            'entry_file_path': 'entryFilePath',
            'dependencies_file_path': 'dependenciesFilePath',
            'compute_key': 'computeKey',
            'guardrails': 'guardrails',
            'session_config': 'sessionConfig',
            'diagram': 'diagram'
        }

        self._display_name = None
        self._description = None
        self._path_info = None
        self._type = None
        self._entry_file_path = None
        self._dependencies_file_path = None
        self._compute_key = None
        self._guardrails = None
        self._session_config = None
        self._diagram = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateAgentFlowDetails.
        AgentFlow name.


        :return: The display_name of this CreateAgentFlowDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateAgentFlowDetails.
        AgentFlow name.


        :param display_name: The display_name of this CreateAgentFlowDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateAgentFlowDetails.
        AgentFlow description.


        :return: The description of this CreateAgentFlowDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateAgentFlowDetails.
        AgentFlow description.


        :param description: The description of this CreateAgentFlowDetails.
        :type: str
        """
        self._description = description

    @property
    def path_info(self):
        """
        **[Required]** Gets the path_info of this CreateAgentFlowDetails.
        Path inside volume where the agentFlow json is written


        :return: The path_info of this CreateAgentFlowDetails.
        :rtype: str
        """
        return self._path_info

    @path_info.setter
    def path_info(self, path_info):
        """
        Sets the path_info of this CreateAgentFlowDetails.
        Path inside volume where the agentFlow json is written


        :param path_info: The path_info of this CreateAgentFlowDetails.
        :type: str
        """
        self._path_info = path_info

    @property
    def type(self):
        """
        Gets the type of this CreateAgentFlowDetails.
        The type of Agent Flow (Canvas or Code)

        Allowed values for this property are: "CANVAS", "CODE"


        :return: The type of this CreateAgentFlowDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateAgentFlowDetails.
        The type of Agent Flow (Canvas or Code)


        :param type: The type of this CreateAgentFlowDetails.
        :type: str
        """
        allowed_values = ["CANVAS", "CODE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def entry_file_path(self):
        """
        Gets the entry_file_path of this CreateAgentFlowDetails.
        The path to project entry file


        :return: The entry_file_path of this CreateAgentFlowDetails.
        :rtype: str
        """
        return self._entry_file_path

    @entry_file_path.setter
    def entry_file_path(self, entry_file_path):
        """
        Sets the entry_file_path of this CreateAgentFlowDetails.
        The path to project entry file


        :param entry_file_path: The entry_file_path of this CreateAgentFlowDetails.
        :type: str
        """
        self._entry_file_path = entry_file_path

    @property
    def dependencies_file_path(self):
        """
        Gets the dependencies_file_path of this CreateAgentFlowDetails.
        The path to dependencies file


        :return: The dependencies_file_path of this CreateAgentFlowDetails.
        :rtype: str
        """
        return self._dependencies_file_path

    @dependencies_file_path.setter
    def dependencies_file_path(self, dependencies_file_path):
        """
        Sets the dependencies_file_path of this CreateAgentFlowDetails.
        The path to dependencies file


        :param dependencies_file_path: The dependencies_file_path of this CreateAgentFlowDetails.
        :type: str
        """
        self._dependencies_file_path = dependencies_file_path

    @property
    def compute_key(self):
        """
        Gets the compute_key of this CreateAgentFlowDetails.
        The key of the Agent Flow Compute associated with this Agent Flow


        :return: The compute_key of this CreateAgentFlowDetails.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this CreateAgentFlowDetails.
        The key of the Agent Flow Compute associated with this Agent Flow


        :param compute_key: The compute_key of this CreateAgentFlowDetails.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def guardrails(self):
        """
        Gets the guardrails of this CreateAgentFlowDetails.

        :return: The guardrails of this CreateAgentFlowDetails.
        :rtype: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        return self._guardrails

    @guardrails.setter
    def guardrails(self, guardrails):
        """
        Sets the guardrails of this CreateAgentFlowDetails.

        :param guardrails: The guardrails of this CreateAgentFlowDetails.
        :type: oci.aidataplatform_dp.models.GuardrailsConfiguration
        """
        self._guardrails = guardrails

    @property
    def session_config(self):
        """
        Gets the session_config of this CreateAgentFlowDetails.

        :return: The session_config of this CreateAgentFlowDetails.
        :rtype: oci.aidataplatform_dp.models.SessionConfiguration
        """
        return self._session_config

    @session_config.setter
    def session_config(self, session_config):
        """
        Sets the session_config of this CreateAgentFlowDetails.

        :param session_config: The session_config of this CreateAgentFlowDetails.
        :type: oci.aidataplatform_dp.models.SessionConfiguration
        """
        self._session_config = session_config

    @property
    def diagram(self):
        """
        Gets the diagram of this CreateAgentFlowDetails.

        :return: The diagram of this CreateAgentFlowDetails.
        :rtype: oci.aidataplatform_dp.models.AgentFlowDiagram
        """
        return self._diagram

    @diagram.setter
    def diagram(self, diagram):
        """
        Sets the diagram of this CreateAgentFlowDetails.

        :param diagram: The diagram of this CreateAgentFlowDetails.
        :type: oci.aidataplatform_dp.models.AgentFlowDiagram
        """
        self._diagram = diagram

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
