# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_runtime_config import ClusterRuntimeConfig
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SparkRuntimeConfig(ClusterRuntimeConfig):
    """
    Spark runtime information.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SparkRuntimeConfig object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.SparkRuntimeConfig.type` attribute
        of this class is ``SPARK`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this SparkRuntimeConfig.
            Allowed values for this property are: "SPARK"
        :type type: str

        :param init_scripts:
            The value to assign to the init_scripts property of this SparkRuntimeConfig.
        :type init_scripts: list[oci.aidataplatform_dp.models.InitScriptPath]

        :param spark_version:
            The value to assign to the spark_version property of this SparkRuntimeConfig.
        :type spark_version: str

        :param spark_advanced_configurations:
            The value to assign to the spark_advanced_configurations property of this SparkRuntimeConfig.
        :type spark_advanced_configurations: dict(str, str)

        :param spark_env_variables:
            The value to assign to the spark_env_variables property of this SparkRuntimeConfig.
        :type spark_env_variables: dict(str, str)

        """
        self.swagger_types = {
            'type': 'str',
            'init_scripts': 'list[InitScriptPath]',
            'spark_version': 'str',
            'spark_advanced_configurations': 'dict(str, str)',
            'spark_env_variables': 'dict(str, str)'
        }

        self.attribute_map = {
            'type': 'type',
            'init_scripts': 'initScripts',
            'spark_version': 'sparkVersion',
            'spark_advanced_configurations': 'sparkAdvancedConfigurations',
            'spark_env_variables': 'sparkEnvVariables'
        }

        self._type = None
        self._init_scripts = None
        self._spark_version = None
        self._spark_advanced_configurations = None
        self._spark_env_variables = None
        self._type = 'SPARK'

    @property
    def spark_version(self):
        """
        Gets the spark_version of this SparkRuntimeConfig.
        Spark version used to run the application.


        :return: The spark_version of this SparkRuntimeConfig.
        :rtype: str
        """
        return self._spark_version

    @spark_version.setter
    def spark_version(self, spark_version):
        """
        Sets the spark_version of this SparkRuntimeConfig.
        Spark version used to run the application.


        :param spark_version: The spark_version of this SparkRuntimeConfig.
        :type: str
        """
        self._spark_version = spark_version

    @property
    def spark_advanced_configurations(self):
        """
        Gets the spark_advanced_configurations of this SparkRuntimeConfig.
        Spark configuration passed to the running process.


        :return: The spark_advanced_configurations of this SparkRuntimeConfig.
        :rtype: dict(str, str)
        """
        return self._spark_advanced_configurations

    @spark_advanced_configurations.setter
    def spark_advanced_configurations(self, spark_advanced_configurations):
        """
        Sets the spark_advanced_configurations of this SparkRuntimeConfig.
        Spark configuration passed to the running process.


        :param spark_advanced_configurations: The spark_advanced_configurations of this SparkRuntimeConfig.
        :type: dict(str, str)
        """
        self._spark_advanced_configurations = spark_advanced_configurations

    @property
    def spark_env_variables(self):
        """
        Gets the spark_env_variables of this SparkRuntimeConfig.
        Environment variables passed to the running process. See <a href=\"https://spark.apache.org/docs/latest/configuration.html#available-properties\" target=\"_blank\" rel=\"noopener noreferrer\">Available Properties</a>.
        Example - { \"spark.app.name\" : \"My App Name\", \"spark.shuffle.io.maxRetries\" : \"4\" }
        Note: Not all Spark properties are permitted to be set. Attempting to set a property that is
        not allowed to be overwritten will cause a 400 status to be returned.


        :return: The spark_env_variables of this SparkRuntimeConfig.
        :rtype: dict(str, str)
        """
        return self._spark_env_variables

    @spark_env_variables.setter
    def spark_env_variables(self, spark_env_variables):
        """
        Sets the spark_env_variables of this SparkRuntimeConfig.
        Environment variables passed to the running process. See <a href=\"https://spark.apache.org/docs/latest/configuration.html#available-properties\" target=\"_blank\" rel=\"noopener noreferrer\">Available Properties</a>.
        Example - { \"spark.app.name\" : \"My App Name\", \"spark.shuffle.io.maxRetries\" : \"4\" }
        Note: Not all Spark properties are permitted to be set. Attempting to set a property that is
        not allowed to be overwritten will cause a 400 status to be returned.


        :param spark_env_variables: The spark_env_variables of this SparkRuntimeConfig.
        :type: dict(str, str)
        """
        self._spark_env_variables = spark_env_variables

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
