# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExternalCatalogMigrationResult(object):
    """
    The details of catalog migration operation
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExternalCatalogMigrationResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param total_external_catalogs:
            The value to assign to the total_external_catalogs property of this ExternalCatalogMigrationResult.
        :type total_external_catalogs: int

        :param new_design_external_catalog_count:
            The value to assign to the new_design_external_catalog_count property of this ExternalCatalogMigrationResult.
        :type new_design_external_catalog_count: int

        :param migrated_external_catalogs:
            The value to assign to the migrated_external_catalogs property of this ExternalCatalogMigrationResult.
        :type migrated_external_catalogs: list[oci.aidataplatform_dp.models.CatalogMigrationDetail]

        :param failed_migration_external_catalogs:
            The value to assign to the failed_migration_external_catalogs property of this ExternalCatalogMigrationResult.
        :type failed_migration_external_catalogs: list[oci.aidataplatform_dp.models.CatalogMigrationDetail]

        :param migration_failed_with_exception:
            The value to assign to the migration_failed_with_exception property of this ExternalCatalogMigrationResult.
        :type migration_failed_with_exception: int

        """
        self.swagger_types = {
            'total_external_catalogs': 'int',
            'new_design_external_catalog_count': 'int',
            'migrated_external_catalogs': 'list[CatalogMigrationDetail]',
            'failed_migration_external_catalogs': 'list[CatalogMigrationDetail]',
            'migration_failed_with_exception': 'int'
        }

        self.attribute_map = {
            'total_external_catalogs': 'totalExternalCatalogs',
            'new_design_external_catalog_count': 'newDesignExternalCatalogCount',
            'migrated_external_catalogs': 'migratedExternalCatalogs',
            'failed_migration_external_catalogs': 'failedMigrationExternalCatalogs',
            'migration_failed_with_exception': 'migrationFailedWithException'
        }

        self._total_external_catalogs = None
        self._new_design_external_catalog_count = None
        self._migrated_external_catalogs = None
        self._failed_migration_external_catalogs = None
        self._migration_failed_with_exception = None

    @property
    def total_external_catalogs(self):
        """
        **[Required]** Gets the total_external_catalogs of this ExternalCatalogMigrationResult.
        Total External catalog present


        :return: The total_external_catalogs of this ExternalCatalogMigrationResult.
        :rtype: int
        """
        return self._total_external_catalogs

    @total_external_catalogs.setter
    def total_external_catalogs(self, total_external_catalogs):
        """
        Sets the total_external_catalogs of this ExternalCatalogMigrationResult.
        Total External catalog present


        :param total_external_catalogs: The total_external_catalogs of this ExternalCatalogMigrationResult.
        :type: int
        """
        self._total_external_catalogs = total_external_catalogs

    @property
    def new_design_external_catalog_count(self):
        """
        **[Required]** Gets the new_design_external_catalog_count of this ExternalCatalogMigrationResult.
        No of external catalogs with new design


        :return: The new_design_external_catalog_count of this ExternalCatalogMigrationResult.
        :rtype: int
        """
        return self._new_design_external_catalog_count

    @new_design_external_catalog_count.setter
    def new_design_external_catalog_count(self, new_design_external_catalog_count):
        """
        Sets the new_design_external_catalog_count of this ExternalCatalogMigrationResult.
        No of external catalogs with new design


        :param new_design_external_catalog_count: The new_design_external_catalog_count of this ExternalCatalogMigrationResult.
        :type: int
        """
        self._new_design_external_catalog_count = new_design_external_catalog_count

    @property
    def migrated_external_catalogs(self):
        """
        Gets the migrated_external_catalogs of this ExternalCatalogMigrationResult.
        No of external catalogs migrated successfully


        :return: The migrated_external_catalogs of this ExternalCatalogMigrationResult.
        :rtype: list[oci.aidataplatform_dp.models.CatalogMigrationDetail]
        """
        return self._migrated_external_catalogs

    @migrated_external_catalogs.setter
    def migrated_external_catalogs(self, migrated_external_catalogs):
        """
        Sets the migrated_external_catalogs of this ExternalCatalogMigrationResult.
        No of external catalogs migrated successfully


        :param migrated_external_catalogs: The migrated_external_catalogs of this ExternalCatalogMigrationResult.
        :type: list[oci.aidataplatform_dp.models.CatalogMigrationDetail]
        """
        self._migrated_external_catalogs = migrated_external_catalogs

    @property
    def failed_migration_external_catalogs(self):
        """
        Gets the failed_migration_external_catalogs of this ExternalCatalogMigrationResult.
        No of external catalogs migration failed


        :return: The failed_migration_external_catalogs of this ExternalCatalogMigrationResult.
        :rtype: list[oci.aidataplatform_dp.models.CatalogMigrationDetail]
        """
        return self._failed_migration_external_catalogs

    @failed_migration_external_catalogs.setter
    def failed_migration_external_catalogs(self, failed_migration_external_catalogs):
        """
        Sets the failed_migration_external_catalogs of this ExternalCatalogMigrationResult.
        No of external catalogs migration failed


        :param failed_migration_external_catalogs: The failed_migration_external_catalogs of this ExternalCatalogMigrationResult.
        :type: list[oci.aidataplatform_dp.models.CatalogMigrationDetail]
        """
        self._failed_migration_external_catalogs = failed_migration_external_catalogs

    @property
    def migration_failed_with_exception(self):
        """
        Gets the migration_failed_with_exception of this ExternalCatalogMigrationResult.
        Count of Catalog Failed with exception before migration


        :return: The migration_failed_with_exception of this ExternalCatalogMigrationResult.
        :rtype: int
        """
        return self._migration_failed_with_exception

    @migration_failed_with_exception.setter
    def migration_failed_with_exception(self, migration_failed_with_exception):
        """
        Sets the migration_failed_with_exception of this ExternalCatalogMigrationResult.
        Count of Catalog Failed with exception before migration


        :param migration_failed_with_exception: The migration_failed_with_exception of this ExternalCatalogMigrationResult.
        :type: int
        """
        self._migration_failed_with_exception = migration_failed_with_exception

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
