# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CopyAgentDetails(object):
    """
    Details to copy the agent to target workspace.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CopyAgentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param target_display_name:
            The value to assign to the target_display_name property of this CopyAgentDetails.
        :type target_display_name: str

        :param target_description:
            The value to assign to the target_description property of this CopyAgentDetails.
        :type target_description: str

        :param target_path_info:
            The value to assign to the target_path_info property of this CopyAgentDetails.
        :type target_path_info: str

        :param target_workspace_key:
            The value to assign to the target_workspace_key property of this CopyAgentDetails.
        :type target_workspace_key: str

        """
        self.swagger_types = {
            'target_display_name': 'str',
            'target_description': 'str',
            'target_path_info': 'str',
            'target_workspace_key': 'str'
        }

        self.attribute_map = {
            'target_display_name': 'targetDisplayName',
            'target_description': 'targetDescription',
            'target_path_info': 'targetPathInfo',
            'target_workspace_key': 'targetWorkspaceKey'
        }

        self._target_display_name = None
        self._target_description = None
        self._target_path_info = None
        self._target_workspace_key = None

    @property
    def target_display_name(self):
        """
        Gets the target_display_name of this CopyAgentDetails.
        Agent name.


        :return: The target_display_name of this CopyAgentDetails.
        :rtype: str
        """
        return self._target_display_name

    @target_display_name.setter
    def target_display_name(self, target_display_name):
        """
        Sets the target_display_name of this CopyAgentDetails.
        Agent name.


        :param target_display_name: The target_display_name of this CopyAgentDetails.
        :type: str
        """
        self._target_display_name = target_display_name

    @property
    def target_description(self):
        """
        Gets the target_description of this CopyAgentDetails.
        Agent description.


        :return: The target_description of this CopyAgentDetails.
        :rtype: str
        """
        return self._target_description

    @target_description.setter
    def target_description(self, target_description):
        """
        Sets the target_description of this CopyAgentDetails.
        Agent description.


        :param target_description: The target_description of this CopyAgentDetails.
        :type: str
        """
        self._target_description = target_description

    @property
    def target_path_info(self):
        """
        **[Required]** Gets the target_path_info of this CopyAgentDetails.
        Path inside volume where the agent JSON is written.


        :return: The target_path_info of this CopyAgentDetails.
        :rtype: str
        """
        return self._target_path_info

    @target_path_info.setter
    def target_path_info(self, target_path_info):
        """
        Sets the target_path_info of this CopyAgentDetails.
        Path inside volume where the agent JSON is written.


        :param target_path_info: The target_path_info of this CopyAgentDetails.
        :type: str
        """
        self._target_path_info = target_path_info

    @property
    def target_workspace_key(self):
        """
        **[Required]** Gets the target_workspace_key of this CopyAgentDetails.
        Key of the target workspace where the agent is copied.


        :return: The target_workspace_key of this CopyAgentDetails.
        :rtype: str
        """
        return self._target_workspace_key

    @target_workspace_key.setter
    def target_workspace_key(self, target_workspace_key):
        """
        Sets the target_workspace_key of this CopyAgentDetails.
        Key of the target workspace where the agent is copied.


        :param target_workspace_key: The target_workspace_key of this CopyAgentDetails.
        :type: str
        """
        self._target_workspace_key = target_workspace_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
