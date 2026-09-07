# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExportComputeConfigurationDetails(object):
    """
    Customer-selected Compute configuration values and YAML destination.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExportComputeConfigurationDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param destination_path:
            The value to assign to the destination_path property of this ExportComputeConfigurationDetails.
        :type destination_path: str

        :param file_name:
            The value to assign to the file_name property of this ExportComputeConfigurationDetails.
        :type file_name: str

        :param cluster_scoped_libraries:
            The value to assign to the cluster_scoped_libraries property of this ExportComputeConfigurationDetails.
        :type cluster_scoped_libraries: list[oci.aidataplatform_dp.models.ComputeConfigurationLibraryEntry]

        :param environment_variables:
            The value to assign to the environment_variables property of this ExportComputeConfigurationDetails.
        :type environment_variables: dict(str, str)

        """
        self.swagger_types = {
            'destination_path': 'str',
            'file_name': 'str',
            'cluster_scoped_libraries': 'list[ComputeConfigurationLibraryEntry]',
            'environment_variables': 'dict(str, str)'
        }

        self.attribute_map = {
            'destination_path': 'destinationPath',
            'file_name': 'fileName',
            'cluster_scoped_libraries': 'clusterScopedLibraries',
            'environment_variables': 'environmentVariables'
        }

        self._destination_path = None
        self._file_name = None
        self._cluster_scoped_libraries = None
        self._environment_variables = None

    @property
    def destination_path(self):
        """
        Gets the destination_path of this ExportComputeConfigurationDetails.
        Destination folder. Use /Workspace/... for a workspace file or /Volumes/<catalog>/<schema>/<volume>/... for a volume file. Defaults to /Workspace/configurations/.


        :return: The destination_path of this ExportComputeConfigurationDetails.
        :rtype: str
        """
        return self._destination_path

    @destination_path.setter
    def destination_path(self, destination_path):
        """
        Sets the destination_path of this ExportComputeConfigurationDetails.
        Destination folder. Use /Workspace/... for a workspace file or /Volumes/<catalog>/<schema>/<volume>/... for a volume file. Defaults to /Workspace/configurations/.


        :param destination_path: The destination_path of this ExportComputeConfigurationDetails.
        :type: str
        """
        self._destination_path = destination_path

    @property
    def file_name(self):
        """
        Gets the file_name of this ExportComputeConfigurationDetails.
        Optional YAML filename. API-handler appends .yaml when omitted.


        :return: The file_name of this ExportComputeConfigurationDetails.
        :rtype: str
        """
        return self._file_name

    @file_name.setter
    def file_name(self, file_name):
        """
        Sets the file_name of this ExportComputeConfigurationDetails.
        Optional YAML filename. API-handler appends .yaml when omitted.


        :param file_name: The file_name of this ExportComputeConfigurationDetails.
        :type: str
        """
        self._file_name = file_name

    @property
    def cluster_scoped_libraries(self):
        """
        Gets the cluster_scoped_libraries of this ExportComputeConfigurationDetails.
        Selected cluster-scoped library entries. Each entry must set exactly one of path, pip, or jar.


        :return: The cluster_scoped_libraries of this ExportComputeConfigurationDetails.
        :rtype: list[oci.aidataplatform_dp.models.ComputeConfigurationLibraryEntry]
        """
        return self._cluster_scoped_libraries

    @cluster_scoped_libraries.setter
    def cluster_scoped_libraries(self, cluster_scoped_libraries):
        """
        Sets the cluster_scoped_libraries of this ExportComputeConfigurationDetails.
        Selected cluster-scoped library entries. Each entry must set exactly one of path, pip, or jar.


        :param cluster_scoped_libraries: The cluster_scoped_libraries of this ExportComputeConfigurationDetails.
        :type: list[oci.aidataplatform_dp.models.ComputeConfigurationLibraryEntry]
        """
        self._cluster_scoped_libraries = cluster_scoped_libraries

    @property
    def environment_variables(self):
        """
        Gets the environment_variables of this ExportComputeConfigurationDetails.
        Selected environment-variable keys and values to write to the YAML file.


        :return: The environment_variables of this ExportComputeConfigurationDetails.
        :rtype: dict(str, str)
        """
        return self._environment_variables

    @environment_variables.setter
    def environment_variables(self, environment_variables):
        """
        Sets the environment_variables of this ExportComputeConfigurationDetails.
        Selected environment-variable keys and values to write to the YAML file.


        :param environment_variables: The environment_variables of this ExportComputeConfigurationDetails.
        :type: dict(str, str)
        """
        self._environment_variables = environment_variables

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
