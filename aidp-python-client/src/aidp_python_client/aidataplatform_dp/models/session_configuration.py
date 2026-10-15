# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SessionConfiguration(object):
    """
    Session configuration for an Agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SessionConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param variables:
            The value to assign to the variables property of this SessionConfiguration.
        :type variables: dict(str, SessionVariableDetails)

        :param session_retention_config:
            The value to assign to the session_retention_config property of this SessionConfiguration.
        :type session_retention_config: oci.aidataplatform_dp.models.SessionRetentionConfiguration

        :param automatic_summarization_config:
            The value to assign to the automatic_summarization_config property of this SessionConfiguration.
        :type automatic_summarization_config: oci.aidataplatform_dp.models.AutomaticSummarizationConfiguration

        :param long_term_memory_config:
            The value to assign to the long_term_memory_config property of this SessionConfiguration.
        :type long_term_memory_config: oci.aidataplatform_dp.models.LongTermMemoryConfiguration

        :param file_config:
            The value to assign to the file_config property of this SessionConfiguration.
        :type file_config: oci.aidataplatform_dp.models.FileConfiguration

        """
        self.swagger_types = {
            'variables': 'dict(str, SessionVariableDetails)',
            'session_retention_config': 'SessionRetentionConfiguration',
            'automatic_summarization_config': 'AutomaticSummarizationConfiguration',
            'long_term_memory_config': 'LongTermMemoryConfiguration',
            'file_config': 'FileConfiguration'
        }
        self.attribute_map = {
            'variables': 'variables',
            'session_retention_config': 'sessionRetentionConfig',
            'automatic_summarization_config': 'automaticSummarizationConfig',
            'long_term_memory_config': 'longTermMemoryConfig',
            'file_config': 'fileConfig'
        }
        self._variables = None
        self._session_retention_config = None
        self._automatic_summarization_config = None
        self._long_term_memory_config = None
        self._file_config = None

    @property
    def variables(self):
        """
        Gets the variables of this SessionConfiguration.
        Map of session variable name to variable definition.


        :return: The variables of this SessionConfiguration.
        :rtype: dict(str, SessionVariableDetails)
        """
        return self._variables

    @variables.setter
    def variables(self, variables):
        """
        Sets the variables of this SessionConfiguration.
        Map of session variable name to variable definition.


        :param variables: The variables of this SessionConfiguration.
        :type: dict(str, SessionVariableDetails)
        """
        self._variables = variables

    @property
    def session_retention_config(self):
        """
        Gets the session_retention_config of this SessionConfiguration.

        :return: The session_retention_config of this SessionConfiguration.
        :rtype: oci.aidataplatform_dp.models.SessionRetentionConfiguration
        """
        return self._session_retention_config

    @session_retention_config.setter
    def session_retention_config(self, session_retention_config):
        """
        Sets the session_retention_config of this SessionConfiguration.

        :param session_retention_config: The session_retention_config of this SessionConfiguration.
        :type: oci.aidataplatform_dp.models.SessionRetentionConfiguration
        """
        self._session_retention_config = session_retention_config

    @property
    def automatic_summarization_config(self):
        """
        Gets the automatic_summarization_config of this SessionConfiguration.

        :return: The automatic_summarization_config of this SessionConfiguration.
        :rtype: oci.aidataplatform_dp.models.AutomaticSummarizationConfiguration
        """
        return self._automatic_summarization_config

    @automatic_summarization_config.setter
    def automatic_summarization_config(self, automatic_summarization_config):
        """
        Sets the automatic_summarization_config of this SessionConfiguration.

        :param automatic_summarization_config: The automatic_summarization_config of this SessionConfiguration.
        :type: oci.aidataplatform_dp.models.AutomaticSummarizationConfiguration
        """
        self._automatic_summarization_config = automatic_summarization_config

    @property
    def long_term_memory_config(self):
        """
        Gets the long_term_memory_config of this SessionConfiguration.

        :return: The long_term_memory_config of this SessionConfiguration.
        :rtype: oci.aidataplatform_dp.models.LongTermMemoryConfiguration
        """
        return self._long_term_memory_config

    @long_term_memory_config.setter
    def long_term_memory_config(self, long_term_memory_config):
        """
        Sets the long_term_memory_config of this SessionConfiguration.

        :param long_term_memory_config: The long_term_memory_config of this SessionConfiguration.
        :type: oci.aidataplatform_dp.models.LongTermMemoryConfiguration
        """
        self._long_term_memory_config = long_term_memory_config

    @property
    def file_config(self):
        """
        Gets the file_config of this SessionConfiguration.

        :return: The file_config of this SessionConfiguration.
        :rtype: oci.aidataplatform_dp.models.FileConfiguration
        """
        return self._file_config

    @file_config.setter
    def file_config(self, file_config):
        """
        Sets the file_config of this SessionConfiguration.

        :param file_config: The file_config of this SessionConfiguration.
        :type: oci.aidataplatform_dp.models.FileConfiguration
        """
        self._file_config = file_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
